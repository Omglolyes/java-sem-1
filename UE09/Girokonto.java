package UE09;

public class Girokonto {
    private String kontonummer;
    private double kontostand = 0;
    private double dispokredit = 0;

    private static int anzahlKonten;

    public Girokonto() {
        // Meine Lösung
        // String anzahlKontenString = String.valueOf(++anzahlKonten);
        // for (int i = 0; i < 10 - anzahlKontenString.length(); i++) {
        // anzahlKontenString = "0" + anzahlKontenString;
        // }
        // this.kontonummer = "0822" + anzahlKontenString;

        this.kontonummer = "0" + (++anzahlKonten + 8220000);
    }

    public String getKontonummer() {
        return this.kontonummer;
    }

    public double getKontostand() {
        return this.kontostand;
    }

    public double getDispokredit() {
        return dispokredit;
    }

    public void setDispokredit(double dispokredit) {
        this.dispokredit = dispokredit;
    }

    public void einzahlen(double einzahlen) {
        this.kontostand += einzahlen;
    }

    public boolean auszahlen(double betrag) {
        if (this.kontostand + this.dispokredit >= betrag) {
            // kontostand + dispo = max
            this.kontostand -= betrag;
            return true;
        } else {
            return false;
        }
    }

    public boolean ueberweisung(Girokonto zweitesKonto, double betrag) {
        if (this.kontostand + this.dispokredit >= betrag) {
            // kontostand + dispo = max
            this.auszahlen(betrag);
            zweitesKonto.einzahlen(betrag);
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return this.kontonummer + ", " + this.kontostand + ", " + this.dispokredit;
    }

    public static int getAnzahlKonten() {
        return anzahlKonten;
        // return konten.count();
    }

}
