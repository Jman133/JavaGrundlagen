package schleifen;

import java.util.Scanner;

public class Zinsenich {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Eingabe der relevanten werte

		System.out.println("den zu sparenden Betrag angeben ( in €) ");
		double kapital = scanner.nextDouble();

		System.out.println("den Zinssatz eingeben (zb 0,3 für 3 %)");
		double zinssatz = scanner.nextDouble();

		System.out.println("die Laufzeit eingeben");
		double laufzeit = scanner.nextDouble();

		// Ausgabe der Ergebnisse
		System.out.println("\nJahr\tKapital (inkl. Zinsen)");

		for (int jahr = 1; jahr <= laufzeit; jahr++) {
			kapital += kapital * zinssatz;
			System.out.printf("%d\t%.2f%n", jahr, kapital);
		}

		scanner.close();
	}

}
