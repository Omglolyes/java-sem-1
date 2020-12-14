package UE04;

import java.util.Scanner;

public class UE04A5 {
    static final double pi = 3.1415;
    static double rad;

    private static double umfang(double radius) {
        return 2 * pi * radius;
    }

    // Deckelfläche = Grundfläche
    private static double deckelflaeche(double radius) {
        return pi * radius;
    }

    private static double mantelflaeche(double radius, double hoehe) {
        return umfang(radius) * hoehe;
    }

    private static double oberflaeche(double radius, double hoehe) {
        return 2 * deckelflaeche(radius) + mantelflaeche(radius, hoehe);
    }

    private static double volumen(double radius, double hoehe) {
        return deckelflaeche(radius) * hoehe;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Radius der Dose: ");
        double rad = sc.nextDouble();
        System.out.println("Höhe der Dose: ");
        double h = sc.nextDouble();
        sc.close();

        System.out.println("Umfang: " + umfang(rad));
        System.out.println("Deckelfläche: " + deckelflaeche(rad));
        System.out.println("Mantelflaeche: " + mantelflaeche(rad, h));
        System.out.println("Oberflaeche: " + oberflaeche(rad, h));
        System.out.println("Volumen: " + volumen(rad, h));
    }
}