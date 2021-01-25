package UE10;

public class Mitarbeiterverwaltung {
    public static void main(String[] args) {
        Abteilung vertrieb = new Abteilung("Vertrieb");
        Abteilung hr = new Abteilung("HR");
        Mitarbeiter heinz = new Mitarbeiter("Heinz", vertrieb);
        Mitarbeiter peter = new Mitarbeiter("Peter", vertrieb);
        Mitarbeiter gertrud = new Mitarbeiter("Gertrud", hr);
        Mitarbeiter axel = new Mitarbeiter("Axxl", hr);

        axel.setName("Axel");
        System.out.println(gertrud.getPersonalnummer());
        System.out.println(heinz.getPersonalnummer());
        System.out.println(heinz.isKollege(peter));
        hr.ausgabeMitarbeiter();
    }
}
