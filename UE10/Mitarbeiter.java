public class Mitarbeiter {
    private String name;
    private int personalnummer;
    private static int anzahlMitarbeiter;
    private Abteilung dieAbteilung;

    public Mitarbeiter(String name, Abteilung abt) {
        ++personalnummer;
        this.name = name;
        abt.addMitarbeiter(this);
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

    public Abteilung getAbteilung() {
        return this.dieAbteilung;
    }

    public boolean isKollege(Mitarbeiter mit) {
        return (mit.dieAbteilung == this.dieAbteilung) ? true : false;
    }

    public Mitarbeiter[] bestimmeKollegen() {
        Mitarbeiter mit[] = new Mitarbeiter[anzahlMitarbeiter - 1];
        boolean zaehler = false;

        for (int i = 0; i < anzahlMitarbeiter; i++) {
            if (zaehler) {
                mit[i - 1] = dieAbteilung.getMitarbeiter(i);
            } else {
                if (dieAbteilung.getMitarbeiter(i).getPersonalnummer() != this.personalnummer)
                    mit[i] = dieAbteilung.getMitarbeiter(i);
                else {
                    zaehler = true;
                }
            }
        }

        return mit;
    }
}