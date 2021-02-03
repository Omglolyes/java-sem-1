package UE12;

public class Geschaeftsfuehrer extends Manager {
    private double zulage;

    public Geschaeftsfuehrer(String name, double festgehalt, double provision, double zulage) {
        super(name, festgehalt, provision);
        this.zulage = zulage;
    }

    public String toString() {
        return super.toString() + ", " + this.zulage;
    }

    public double berechneGehalt() {
        return super.berechneGehalt() + zulage;
    }
}
