package UE10;

public class Abteilung {
    private String bezeichnung;
    private Mitarbeiter mitarbeiter[] = new Mitarbeiter[15];
    public int anzahl;

    public Abteilung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public int getAnzahlMitarbeiter() {
        return anzahl;
    }

    public void addMitarbeiter(Mitarbeiter arbeiter) {
        if (anzahl < 16) {
            this.mitarbeiter[anzahl] = arbeiter;
            anzahl++;
        }
    }

    public Mitarbeiter getMitarbeiter(int i) {
        return mitarbeiter[i];
    }

    public void ausgabeMitarbeiter() {
        for (int i = 0; i < anzahl; i++) {
            System.out.println(mitarbeiter[i].getName() + " " + mitarbeiter[i].getPersonalnummer());
        }
    }
}