package UE09;

public class GirokontoTest {
    public static void main(String[] args) {
        Girokonto girokonto1 = new Girokonto();
        Girokonto girokonto2 = new Girokonto();
        Girokonto girokonto3 = new Girokonto();

        girokonto1.einzahlen(50);
        System.out.println("kontostand girokonto1: " + girokonto1.getKontostand());
        System.out.println(girokonto1.ueberweisung(girokonto2, 30));
        System.out.println("kontostand girokonto1: " + girokonto1.getKontostand());
        System.out.println("kontostand girokonto2: " + girokonto2.getKontostand());

        System.out.println(girokonto1.auszahlen(20));
        System.out.println(girokonto1.auszahlen(1));
        System.out.println(Girokonto.getAnzahlKonten());
        girokonto1.setDispokredit(50);
        System.out.println(girokonto1.auszahlen(50));
        System.out.println("kontostand girokonto1: " + girokonto1.getKontostand());
        System.out.println("Dispo konto1: " + girokonto1.getDispokredit());
        System.out.println(girokonto1.auszahlen(1));

        // alle konten
        Girokonto[] konten = new Girokonto[] { girokonto1, girokonto2, girokonto3 };
        for (Girokonto konto : konten) {
            System.out.println(konto);
        }
    }
}
