package arrays;

import java.util.Arrays;

public class Arrayübung {

	public static void main(String[] args) {

		// Feld 1 nur grade random Zahlen

		int[] feld1 = new int[20];
		
		for (int i = 0; i < feld1.length; i++) {
			feld1[i] = (int) (Math.random() * 100) * 2;
		}

		// feld2 zufällige ganze Zahlen
		int[] feld2 = new int[20];
		for (int i = 0; i < feld2.length; i++) {
			feld2[i] = (int) (Math.random() * 100);
		}

		// Sortierung des Arrays
		Arrays.sort(feld2);

		System.out.println("Feld 1 (Gerade Zahlen): " + Arrays.toString(feld1));
		System.out.println("Feld 2 (Aufsteigen sortiert)" + Arrays.toString(feld2));

	}

}
