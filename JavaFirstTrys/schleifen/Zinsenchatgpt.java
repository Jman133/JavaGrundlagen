package schleifen;
import java.util.Scanner;

public class Zinsenchatgpt
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe der relevanten Werte
        System.out.print("Geben Sie das anzulegende Kapital ein: ");
        double kapital = scanner.nextDouble();

        System.out.print("Geben Sie den Zinssatz (z.B. 0,1 für 10%) ein: ");
        double zinssatz = scanner.nextDouble();

        System.out.print("Geben Sie die Laufzeit der Geldanlage in Jahren ein: ");
        int laufzeit = scanner.nextInt();

        // Ausgabe der Ergebnisse
        System.out.println("\nJahr\tKapital (inkl. Zinsen)");

        for (int jahr = 1; jahr <= laufzeit; jahr++) {
            kapital += kapital * zinssatz; // Kapital mit Zinsen berechnen
            System.out.printf("%d\t%.2f%n", jahr, kapital); // Ausgabe des Kapitals mit 2 Dezimalstellen
        }

        scanner.close();
    }
}


		

