package UE08;

public class Dozent {
    String name;
    String lehrgebiet;
    boolean dekan = false;
    char geschlecht;

    public Dozent(String name, String lehrgebiet, char geschlecht) {
        this.name = name;
        this.lehrgebiet = lehrgebiet;
        this.geschlecht = geschlecht;
    }

    public void setName(String input) {
        this.name = input;
    }

    public void setLehrgebiet(String input) {
        this.lehrgebiet = input;
    }

    public void setGeschlecht(char input) {
        this.geschlecht = input;
    }

    public void setDekan(boolean input) {
        this.dekan = input;
    }

    public String getName() {
        return this.name;
    }

    public String getLehrgebiet() {
        return this.lehrgebiet;
    }

    public char getGeschlecht() {
        return this.geschlecht;
    }

    public boolean isDekan() {
        return this.dekan;
    }
}
