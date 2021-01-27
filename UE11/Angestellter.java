package UE11;

public class Angestellter extends Mitarbeiter {
    private double grundgehalt;
    private double ortszuschlag;
    private double zulage;

    public Angestellter(String name, double grundgehalt, double ortszuschlag, double zulage, Abteilung abt) {
        super(name, abt);
        this.grundgehalt = grundgehalt;
        this.ortszuschlag = ortszuschlag;
        this.zulage = zulage;
    }

    public String toString() {
        return super.toString() + ", " + "rest";
    }

    public double berechneGehalt() {
        return this.grundgehalt + this.ortszuschlag + this.grundgehalt + this.zulage;
    }

}
