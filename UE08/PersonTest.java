package UE08;

public class PersonTest {
    public static void main(String[] args) {
        Person erstePerson = new Person("Dagobert", "Reich");
        Person zweitePerson = new Person("Gustav", "Lebenskünstler");
        erstePerson.setNachname("Reicher");
        zweitePerson = new Person("Donald", "Arm");
        zweitePerson.setSteuerklasse(3);

        System.out.println(erstePerson.getVorname());
        System.out.println(erstePerson.getNachname());
        System.out.println(erstePerson.getSteuerklasse());
        System.out.println(zweitePerson.getVorname());
        System.out.println(zweitePerson.getNachname());
        System.out.println(zweitePerson.getSteuerklasse());
    }
}
