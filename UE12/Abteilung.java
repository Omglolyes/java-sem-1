package UE12;

public class Abteilung {
    private String bezeichung;
    private int anzahlMitarbeiter;
    private static final int maxMitarbeiter = 15;
    private Mitarbeiter[] dieMitarbeiter;

    public Abteilung(String bezeichnung) {
        dieMitarbeiter = new Mitarbeiter[maxMitarbeiter];
        anzahlMitarbeiter = 0;
        this.bezeichung = bezeichnung;
    }

    public String getBezeichnung() {
        return this.bezeichung;
    }

    public int getAnzahlMitarbeiter() {
        return anzahlMitarbeiter;
    }

    public void addMitarbeiter(Mitarbeiter mit) {
        if (getAnzahlMitarbeiter() <= maxMitarbeiter) {
            dieMitarbeiter[anzahlMitarbeiter] = mit;
            anzahlMitarbeiter++;
        }
    }

    public Mitarbeiter getMitarbeiter(int i) {
        return dieMitarbeiter[i];
    }

    public int getAnzahlAngestellte() {
        int j = 0;
        for (int i = 0; i < getAnzahlMitarbeiter(); i++) {
            if (dieMitarbeiter[i] instanceof Angestellter) {
                j++;
            }
        }
        return j;
    }

    public double berechneGehaltskosten() {
        double gesamtGehalt = 0.0;
        for (int i = 0; i < getAnzahlMitarbeiter(); i++) {
            gesamtGehalt += dieMitarbeiter[i].berechneGehalt();
        }
        return gesamtGehalt;
    }
}