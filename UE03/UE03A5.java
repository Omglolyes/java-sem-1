package UE03;

public class UE03A5 {
    // Zeichenketten
    public static void main(String[] args) {
        // Inkorrekte Zeilen sind auskommentiert und mit ! gekennzeichnet
        System.out.println("Hello World");
        System.out.print("Hello");
        System.out.println(" World");
        System.out.println("4*5");
        System.out.println(4 * 5);
        System.out.println("Dies ist" + "ein Text");
        System.out.println("Dies ist" + "ein Text");
        System.out.println("Dies ist ein \nText");
        // Zeichen
        System.out.println("\u0065");
        // ! System.out.println(""");
        System.out.println("\"");
        // Ganze Zahlen
        System.out.println(2147483647);
        System.out.println(2147483647 + 1);
        System.out.println(0xFF);
        System.out.println(0xFFFF);
        System.out.println(0xFFFFFF);
        System.out.println(0xFFFFFFFF);
        // ! System.out.println(0xFG);
        // Gleitpunktzahlen
        System.out.println("Zahl " + 0.344e-17f);
        // ! System.out.println("Zahl " + 0,344e-17f );
        System.out.println("Zahl " + 0.12345678901234567890);
        System.out.println("Zahl " + 0.12345678901234567890f);
        System.out.println("Summe " + (5.6 + 5.8));
        System.out.println("Summe " + (12345678.0f + 0.1f));
        System.out.println("Differenz " + (0.123456789f - 0.123456788f));
        System.out.println("Summe " + ((12345678.0f + 0.1f) + 0.41f));
        System.out.println("Summe " + (12345678.0f + (0.1f + 0.41f)));
    }
}
