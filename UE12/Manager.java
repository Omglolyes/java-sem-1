package UE12;

public class Manager extends Mitarbeiter {
    private double festgehalt;
    private double provision;
    private double umsatz;

    public Manager(String name, double festgehalt, double provision) {
        super(name);
        this.festgehalt = festgehalt;
        this.provision = provision;
    }

    public void setUmsatz(double umsatz) {
        this.umsatz = umsatz;
    }

    public String toString() {
        var c = ", ";
        return super.getName() + c + super.getPersonalnummer() + c + this.festgehalt + c + this.provision + c
                + this.umsatz;
    }

    public double berechneGehalt() {
        return (this.festgehalt + this.provision) * this.umsatz;
    }
}
