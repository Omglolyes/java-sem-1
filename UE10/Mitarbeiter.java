package UE10;

public class Mitarbeiter {
    private String name;
    private int personamnummer;
    private static int AnzahlMitarbeiter;

    public Mitarbeiter(String name, Abteilung abt) {

    }

    public static void setAnzahlMitarbeiter(int anzahlMitarbeiter) {
        AnzahlMitarbeiter = anzahlMitarbeiter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPersonamnummer() {
        return personamnummer;
    }

    public Abteilung getAbteilung() {
        return new Abteilung("Bitte bearbeiten");
    }

    public boolean isKollegen(Mitarbeiter mit) {
        return false;
    }
}
