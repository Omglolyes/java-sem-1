package UE11;

public class Arbeiter extends Mitarbeiter {
    private double stundenlohn;
    private double anzahlStunden;
    private double ueberstundenzuschlag;
    private double anzahlUberstunden;

    public Arbeiter(String name, double anzahlStunden, double stundenlohn, double ueberstundenzuschlag, Abteilung abt) {
        super(name, abt);

        this.anzahlStunden = anzahlStunden;
        this.stundenlohn = stundenlohn;
        this.ueberstundenzuschlag = ueberstundenzuschlag;
    }

    public void setAnzahlUeberstunden(double anzahlUberstunden) {
        this.anzahlUberstunden = anzahlUberstunden;
    }

    public String toString() {
        return super.toString() + " , " + this.stundenlohn + " , " + this.anzahlStunden;
    }

    public double berechneGehalt() {
        return (this.anzahlStunden * this.stundenlohn) + (this.anzahlUberstunden * ueberstundenzuschlag);
    }
}
