package UE11;

public abstract class A2_GObjekt {
    private static int objektAnzahl = 0;
    protected int posX;
    protected int posY;

    public static void objektHinzufügen(A2_GObjekt objekt) {
        objektAnzahl++;
    }

    public static void objektEntfernen(A2_GObjekt objekt) {
        objektAnzahl--;
    }

    abstract public void zeichnen();
}
