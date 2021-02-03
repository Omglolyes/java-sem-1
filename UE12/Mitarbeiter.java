package UE12;

public abstract class Mitarbeiter {
    private String name;
    private int personalnummer;
    private static int anzahlMitarbeiter;

    public Mitarbeiter(String name) {
        ++personalnummer;
        ++anzahlMitarbeiter;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getPersonalnummer() {
        return this.personalnummer;
    }

    public abstract double berechneGehalt();
}