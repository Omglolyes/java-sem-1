package UE02;

import java.util.Scanner;

public class UE02A5 {
    public static void main(String[] args) {
        // Eingabe
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte eine ganze Zahl eingeben");
        int x = sc.nextInt();

        // Polynom berechnen
        int mon1 = 5 * x;
        int mon2 = mon1 + 3 * x * x;
        mon1 = mon2 + x * x * x;

        // Ausgabe
        System.out.println(mon1);
        sc.close();
    }
}