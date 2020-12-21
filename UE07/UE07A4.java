package UE07;

import java.util.Scanner;

public class UE07A4 {

    public static void main(String args[]) {
        // Init menu
        String[] menu = new String[4];
        menu[0] = ""; // will be the ---
        menu[1] = "1    Teileranzahl für n";
        menu[2] = "2    Maximale Teileranzahl für die Zahlen 1 bis n";
        menu[3] = "3    Fertig";
        for (int i = 0; i <= menu[2].length(); i++) {
            menu[0] += "-";
        }
        // !Init menu
        Scanner sc = new Scanner(System.in);
        int in = 0;

        while (in != 3) {
            for (String x : menu) {
                System.out.println(x);
            }
            System.out.println(menu[0]);

            in = sc.nextInt();
            if (in == 1) {
                System.out.println("Bitte geben Sie eine ganze Zahl ein");
                in = sc.nextInt();

                in = berechneTeileranzahl(in);
                if (in == 2) {
                    System.out.println("Sie haben eine Primzahl entdeckt, Sie Schlingel!\n");
                }
                System.out.println("Deine Eingabe hat " + in + " Teiler");
                in = 0; // prevent while break
            } else if (in == 2) {
                System.out.println("Bitte geben Sie eine ganze Zahl ein");
                in = sc.nextInt();

                in = berechneMaximaleTeileranzahl(in);
                System.out.println(in + " ist die höchste Teileranzahl.");
                in = 0; // prevent while break
            } else if (in != 3) {
                System.out.println("Bitte geben sie eine gültige Zahl ein");
            }
        }

        sc.close();
    }

    public static int berechneTeileranzahl(int n) {
        if (n < 0) {
            n = -n;
        }
        int counter = 1;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int berechneMaximaleTeileranzahl(int n) {
        int maxMaximaleTeileranzahl = 0;
        int tmp = 0;
        for (int i = 0; i <= n; i++) {
            tmp = berechneTeileranzahl(i);
            if (tmp > maxMaximaleTeileranzahl) {
                maxMaximaleTeileranzahl = tmp;
            }
        }
        return maxMaximaleTeileranzahl;
    }
}