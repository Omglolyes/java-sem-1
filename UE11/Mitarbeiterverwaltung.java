package UE11;

public class Mitarbeiterverwaltung {

    public static void main(String[] args) {

        // test Manager
        Manager a = new Manager("Peter", 2.00, 1.00, new Abteilung("Vertrieb"));
        a.setUmsatz(2.0);
        System.out.println(a.berechneGehalt());
        System.out.println(a.toString());

        // test Geschäftsführer
        Geschaeftsfuehrer b = new Geschaeftsfuehrer("Paula", 2.00, 1.00, 5.00, new Abteilung("Unternehmensleitung"));
        b.setUmsatz(10.00);
        System.out.println(b.berechneGehalt());
        System.out.println(b.toString());

        // Arbeiter c
        Arbeiter c = new Arbeiter("Dieter", 12.00, 20, 2.00, new Abteilung("Fertigung"));
        c.setAnzahlUeberstunden(3.00);
        System.out.println(c.toString());

        // Arbeiter d
        System.out.println(a.getAbteilung());
        Arbeiter d = new Arbeiter("Heinz", 12.00, 20, 2.00, a.getAbteilung());
        d.setAnzahlUeberstunden(3.00);
        System.out.println(d.toString());
    }
}
