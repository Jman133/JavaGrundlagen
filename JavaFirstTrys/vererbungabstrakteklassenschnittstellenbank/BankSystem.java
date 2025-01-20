package vererbungabstrakteklassenschnittstellenbank;

// Abstrakte Klasse Bankkonto
abstract class Bankkonto {
    protected String kontonummer;
    protected double kontostand;

    public Bankkonto(String kontonummer, double kontostand) {
        this.kontonummer = kontonummer;
        this.kontostand = kontostand;
    }

    public void einzahlen(double betrag) {
        if (betrag > 0) {
            kontostand += betrag;
        } else {
            System.out.println("Einzahlungsbetrag muss positiv sein.");
        }
    }

    public abstract void abrechnung();

    @Override
    public String toString() {
        return "Kontonummer: " + kontonummer + ", Kontostand: " + kontostand + " EUR";
    }
}

// Schnittstelle Zinsfaehig
interface Zinsfaehig {
    void zinsenBerechnen();
}

// Schnittstelle Ueberziehbar
interface Ueberziehbar {
    boolean ueberziehungPruefen();
}

// Subklasse SparKonto
class SparKonto extends Bankkonto implements Zinsfaehig {
    private double zinssatz; // in Prozent

    public SparKonto(String kontonummer, double kontostand, double zinssatz) {
        super(kontonummer, kontostand);
        this.zinssatz = zinssatz;
    }

    @Override
    public void zinsenBerechnen() {
        double zinsen = kontostand * (zinssatz / 100);
        kontostand += zinsen;
    }

    @Override
    public void abrechnung() {
        zinsenBerechnen();
    }

    @Override
    public String toString() {
        return super.toString() + ", Zinssatz: " + zinssatz + "%";
    }
}

// Subklasse GiroKonto
class GiroKonto extends Bankkonto implements Ueberziehbar {
    private double dispoLimit;

    public GiroKonto(String kontonummer, double kontostand, double dispoLimit) {
        super(kontonummer, kontostand);
        this.dispoLimit = dispoLimit;
    }

    @Override
    public boolean ueberziehungPruefen() {
        return kontostand < -dispoLimit;
    }

    @Override
    public void abrechnung() {
        if (ueberziehungPruefen()) {
            System.out.println("Überziehungslimit überschritten. Gebühren können anfallen.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Dispo-Limit: " + dispoLimit + " EUR";
    }
}

// Hauptprogramm
public class BankSystem {
    public static void main(String[] args) {
        // SparKonto erstellen
        SparKonto sparKonto = new SparKonto("123456", 5000.0, 2.0);
        sparKonto.einzahlen(300.0);
        sparKonto.abrechnung();
        System.out.println(sparKonto);

        // GiroKonto erstellen
        GiroKonto giroKonto = new GiroKonto("654321", 1000.0, 500.0);
        giroKonto.einzahlen(300.0);
        System.out.println(giroKonto);

        // Überziehung testen
        giroKonto.einzahlen(-1600.0); // Simuliert eine Überziehung
        giroKonto.abrechnung();
        System.out.println(giroKonto);
    }
}
