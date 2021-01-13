package UE10;

public class Abteilung {
    private String bezeichnung;

    public Abteilung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return this.bezeichnung;
    }

    public int getAnzahlMitarbeiter() {
        // return Mitarbeiter.AnzahlMitarbeiter;
        return -1;
    }

    public void addMitarbeiter(Mitarbeiter mit) {
        System.out.print("Bitte bearbeiten");
    }

    public Mitarbeiter getMitarbeiter(int i) {
        return new Mitarbeiter("jonas", this);
    }

    public void ausgabeMitarbeiter() {
        for (int i = 0; i < this.getAnzahlMitarbeiter(); i++) {
            System.out.println(this.getMitarbeiter(i));
        }
    }
}
