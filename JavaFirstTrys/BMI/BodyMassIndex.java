package BMI;

import utils.IO;

public class BodyMassIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double groesse;
		double gewicht;

		String name = IO.promptAndReadString("Name? ");
		System.out.println("Hallo " + name + "! Bitte gib Deine Daten ein.");

		groesse = IO.promptAndReadDouble("Groesse (m)? ");
		gewicht = IO.promptAndReadDouble("Gewicht (kg)? ");

		double bmi = gewicht / (groesse * groesse);
		System.out.println("Ihr BMI ist " + IO.round(bmi, 0));

	}

}
