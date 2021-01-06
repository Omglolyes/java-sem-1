package UE08;

public class DozentTest {
    public static void main(String[] args) {
        Dozent dieDozentin = new Dozent("Rosa", "Mathematik", 'w');
        Dozent derDekan = new Dozent("Peter", "Wirtschaft", 'm');

        printDozenten(new Dozent[] { dieDozentin, derDekan });

        derDekan.setGeschlecht('m');
        derDekan.setName("Urlrich");
        derDekan.setLehrgebiet("Statik");

        // Auch möglich: derDekan.dekan = true;
        // da Dozent.dekan nicht private ist
        derDekan.setDekan(true);

        printDozenten(new Dozent[] { dieDozentin, derDekan });
    }

    private static void printDozenten(Dozent[] dozenten) {
        for (Dozent x : dozenten) {
            System.out.println(x.getName());
            System.out.println(x.getLehrgebiet());
            System.out.println(x.getGeschlecht());
            System.out.println(x.isDekan());
            System.out.println();
        }
    }
}
