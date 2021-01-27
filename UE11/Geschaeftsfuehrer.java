package UE11;

public class Geschaeftsfuehrer extends Manager {
    private double zulage;

    public Geschaeftsfuehrer(String name, double festgehalt, double provision, double zulage, Abteilung abt) {
        super(name, festgehalt, provision, abt);
        this.zulage = zulage;
    }

    public String toString() {
        return super.toString() + ", " + this.zulage;
    }

    public double berechneGehalt() {
        return super.berechneGehalt() + zulage;
    }
}
