package Aufgabe11;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Konto {
    private String kontonummer;
    private double guthaben;
    private String kontoart;

    public Konto(String kontonummer, double guthaben, String kontoart) {
        this.kontonummer = kontonummer;
        this.guthaben = guthaben;
        this.kontoart = kontoart;
    }

    public String getKontonummer() {
        return kontonummer;
    }

    public double getGuthaben() {
        return guthaben;
    }

    public String getKontoart() {
        return kontoart;
    }

    @Override
    public String toString() {
        return "Konto{" +
                "Kontonummer='" + kontonummer + '\'' +
                ", Guthaben=" + guthaben +
                ", Kontoart='" + kontoart + '\'' +
                '}';
    }
}

public class aufgabe11 {
    private static ArrayList<Konto> konten = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        generiereKonten(5); // Automatisch 5 Konten generieren

        boolean running = true;
        while (running) {
            System.out.println("\nMenü:");
            System.out.println("1. Konto hinzufügen");
            System.out.println("2. Konto anzeigen");
            System.out.println("3. Alle Konten anzeigen");
            System.out.println("4. Konto löschen");
            System.out.println("5. Programm beenden");
            System.out.print("Wählen Sie eine Option: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Eingabepuffer leeren

            switch (option) {
                case 1 -> kontoHinzufuegen();
                case 2 -> kontoAnzeigen();
                case 3 -> alleKontenAnzeigen();
                case 4 -> kontoLoeschen();
                case 5 -> {
                    System.out.println("Programm wird beendet.");
                    running = false;
                }
                default -> System.out.println("Ungültige Option. Bitte erneut versuchen.");
            }
        }
    }

    private static void generiereKonten(int anzahl) {
        Random random = new Random();
        for (int i = 0; i < anzahl; i++) {
            String kontonummer = String.format("%06d", random.nextInt(1000000)); // 6-stellige Kontonummer
            double guthaben = 1000 + (random.nextDouble() * (10000 - 1000));   // Guthaben zwischen 1000 und 10000
            String kontoart = random.nextBoolean() ? "SparKonto" : "GiroKonto"; // Zufällige Kontoart

            Konto konto = new Konto(kontonummer, guthaben, kontoart);
            konten.add(konto);
        }
    }

    private static void kontoHinzufuegen() {
        System.out.print("Geben Sie die Kontonummer ein: ");
        String kontonummer = scanner.nextLine();
        System.out.print("Geben Sie das Guthaben ein: ");
        double guthaben = scanner.nextDouble();
        scanner.nextLine(); // Eingabepuffer leeren
        System.out.print("Geben Sie die Kontoart (SparKonto/GiroKonto) ein: ");
        String kontoart = scanner.nextLine();

        Konto konto = new Konto(kontonummer, guthaben, kontoart);
        konten.add(konto);
        System.out.println("Konto erfolgreich hinzugefügt!");
    }

    private static void kontoAnzeigen() {
        System.out.print("Geben Sie die Kontonummer ein: ");
        String kontonummer = scanner.nextLine();

        for (Konto konto : konten) {
            if (konto.getKontonummer().equals(kontonummer)) {
                System.out.println(konto);
                return;
            }
        }
        System.out.println("Kein Konto mit dieser Kontonummer gefunden.");
    }

    private static void alleKontenAnzeigen() {
        if (konten.isEmpty()) {
            System.out.println("Keine Konten vorhanden.");
        } else {
            for (Konto konto : konten) {
                System.out.println("Konto" + konto);
            }
        }
    }

    private static void kontoLoeschen() {
        System.out.print("Geben Sie die Kontonummer ein: ");
        String kontonummer = scanner.nextLine();

        for (int i = 0; i < konten.size(); i++) {
            if (konten.get(i).getKontonummer().equals(kontonummer)) {
                konten.remove(i);
                System.out.println("Konto erfolgreich gelöscht!");
                return;
            }
        }
        System.out.println("Kein Konto mit dieser Kontonummer gefunden.");
    }
}

