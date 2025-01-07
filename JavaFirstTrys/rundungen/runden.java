package rundungen;

import java.util.Scanner;

public class runden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("zahl eingeben:");
		double zahl = scanner.nextDouble();
		int zahlMal100 = (int) (zahl * 100.0 + 0.5);
		double zahlGerundet = zahlMal100 / 100.0;
				
	    System.out.println("Gerundet: " + zahlGerundet);
	    
	    scanner.close(); 
		
		
	}
	
	

}
