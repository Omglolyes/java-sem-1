package UE12;

public class MitarbeiterTest {
    public static void main(String[] args) {
        Abteilung vertrieb = new Abteilung("Vertrieb");
        Abteilung produktion = new Abteilung("Produktion");

        Geschaeftsfuehrer peter = new Geschaeftsfuehrer("Peter", 2, 1, 0);
        Geschaeftsfuehrer fabienne = new Geschaeftsfuehrer("Fabienne", 3, 1, 1);
        Geschaeftsfuehrer gertrud = new Geschaeftsfuehrer("Gertrud", 0, 1, 5);

        Manager frank = new Manager("Frank", 20, 0);
        Manager paula = new Manager("Paula", 21, 4);
        Manager guenther = new Manager("Günter", 10, 15);

        Angestellter jupp = new Angestellter("Jupp", 2, 0, 0);
        Angestellter nadine = new Angestellter("Nadine", 3, 1, 80);
        Angestellter juergen = new Angestellter("Jürgen", 50, 30, 0);
        Angestellter stefan = new Angestellter("Stefan", 5, -3, 12);

        var gfs = new Mitarbeiter[] { peter, fabienne, gertrud };
        var mgr = new Mitarbeiter[] { frank, paula, guenther };
        var ang = new Mitarbeiter[] { jupp, nadine, juergen, stefan };

        for (var arbeiter : gfs) {
            vertrieb.addMitarbeiter(arbeiter);
        }
        for (var arbeiter : mgr) {
            vertrieb.addMitarbeiter(arbeiter);
        }
        for (var arbeiter : ang) {
            produktion.addMitarbeiter(arbeiter);
        }

        for(var abt: new Abteilung[]{vertrieb, produktion}){
            System.out.println(abt.getBezeichnung() + " anz Mitarbeiter: " + abt.getAnzahlMitarbeiter());
            System.out.println(abt.getBezeichnung() + " anz Angestelle: " + abt.getAnzahlAngestellte());
            System.out.println(abt.getBezeichnung() + " Bezeichnung: " + abt.getBezeichnung());
            System.out.println(abt.getBezeichnung() + " Gehaltskosten: " + abt.berechneGehaltskosten());
        }

    }
}
