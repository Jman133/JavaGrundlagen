package aufgabe10;

public class hauptprogramm {

	
		public static void main(String[] args) {
	        // Bank erstellen
	        Bank bank = new Bank();

	        // Zwei Konten erstellen
	        Bankkonto konto1 = new Bankkonto("111111", 3000.0);
	        Bankkonto konto2 = new Bankkonto("222222", 1500.0);

	        // Konten hinzufügen
	        bank.kontoHinzufuegen(konto1);
	        bank.kontoHinzufuegen(konto2);

	        // Alle Konten anzeigen
	        System.out.println("Alle Konten:");
	        bank.zeigeAlleKonten();
	}

}
