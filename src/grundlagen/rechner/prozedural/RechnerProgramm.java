package grundlagen.rechner.prozedural;

public class RechnerProgramm {

	public static void main(String[] args) {
		int zahl1 = 10;
		int zahl2 = 20;
		int ergebnis = zahl1 + zahl2;
		
		System.out.println("Addition von " + zahl1 + " und " + zahl2 + " ist " + ergebnis);
		
		
		int zahl3 = 11;
		int zahl4 = 12;
		int ergebnis2 = zahl3 + zahl4;
				
		System.out.print("Addition von " + zahl3 + " und " + zahl4 + " ist " + ergebnis2);
		

	}
	
	
	
	
	public static void addierenundausgeben(int zahl1, int zahl2) {
		int ergebnis = zahl1 + zahl2;
		System.out.println("Addition von " + zahl1 + " und " + zahl2 + " ist " + ergebnis);
	}
	
}
