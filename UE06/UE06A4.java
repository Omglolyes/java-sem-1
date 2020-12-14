package UE06;

public class UE06A4 {
    public static void main(String args[]) {
        char[][] array = new char[][] { { '*', 'a', '*', 'a' }, { '*', '*', '2', 'r' }, { 'B', 'C', '0', 'a' } };
        System.out.println(berechneSterneProZeile(array));
        System.out.println(berechneSterneProSpalte(array));
        System.out.println("Es gibt " + berechneAnzahlZeilen(array) + " Zeilen mit min. 2 *");

        // Aufgabe d
        char[][] array2 = new char[][] { { '*', '*', '2', 'r' }, { 'B', 'C', '0', 'a' }, { '*', 'a', '*', 'a' } };
        System.out.println(berechneSterneProZeile(array2));
        System.out.println(berechneSterneProSpalte(array2));
        System.out.println("Es gibt " + berechneAnzahlZeilen(array2) + " Zeilen mit min. 2 *");
    }

    public static String berechneSterneProZeile(char[][] array) {
        int zaehler;
        String meinString = "Die Anzahl ist..\n";
        for (int i = 0; i < array.length; i++) {
            zaehler = 0;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == '*') {
                    zaehler++;
                }
            }
            meinString += i + ":" + zaehler + "\n";
        }

        return meinString;
    }

    public static String berechneSterneProSpalte(char[][] array) {
        int zaehler;
        String meinString = "Die Anzahl ist..\n";

        for (int i = 0; i < array[0].length; i++) {
            zaehler = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j][i] == '*') {
                    zaehler++;
                }
            }
            meinString += i + ":" + zaehler + "\n";
        }

        return meinString;
    }

    public static int berechneAnzahlZeilen(char[][] array) {
        int zaehler;
        int zaehlerAnz = 0;
        for (int i = 0; i < array.length; i++) {
            zaehler = 0;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == '*') {
                    zaehler++;
                }
            }
            if (zaehler > 1) {
                zaehlerAnz++;
            }
        }

        return zaehlerAnz;
    }
}
