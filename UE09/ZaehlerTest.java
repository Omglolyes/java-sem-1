package UE09;

public class ZaehlerTest {
    public static void main(String[] args) {
        Zaehler einKmZaehler = new Zaehler(1);
        Zaehler nocheinKmZaehler = new Zaehler(42);
        nocheinKmZaehler.uebertrage(einKmZaehler);
        System.out.println(einKmZaehler == nocheinKmZaehler);
        System.out.println(einKmZaehler.equals(nocheinKmZaehler));
    }
}
