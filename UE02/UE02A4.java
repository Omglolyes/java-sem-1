package UE02;

import java.util.Scanner;

public class UE02A4 {
    public static void main(String[] args) {
        final int MATRNR = 7090000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte erste Zahl eingeben");
        int ersteZahl = sc.nextInt();
        System.out.println("Bitte zweite Zahl eingeben");
        int zweiteZahl = sc.nextInt();
        sc.close();
        ersteZahl += zweiteZahl + MATRNR;
        System.out.println("Das Ergebnis ist " + ersteZahl);
    }
}