package UE08;

public class Person {

    String vorname, nachname;
    int steuerklasse = 1;

    Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    void setVorname(String vorname) {
        this.vorname = vorname;
    }

    void setNachname(String nachname) {
        this.nachname = nachname;
    }

    void setSteuerklasse(int steuerklasse) {
        this.steuerklasse = steuerklasse;
    }

    String getVorname() {
        return this.vorname;
    }

    String getNachname() {
        return this.nachname;
    }

    int getSteuerklasse() {
        return this.steuerklasse;
    }
}
