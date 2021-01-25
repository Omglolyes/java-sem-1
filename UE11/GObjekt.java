package UE11;

public abstract class GObjekt {
    private static int objektAnzahl = 0;
    protected int posX;
    protected int posY;

    public static void objektHinzufügen(GObjekt objekt) {
        objektAnzahl++;
    }

    public static void objektEntfernen(GObjekt objekt) {
        objektAnzahl--;
    }

    abstract public void zeichnen();
}
