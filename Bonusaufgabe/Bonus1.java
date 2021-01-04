package Bonusaufgabe;

import java.util.Scanner;

public class Bonus1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Geben Sie n für die Zeilen/- Spaltenzahl ein: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Bonusaufgabe.GameOfLife.printField(erstelleFeld(n));
        sc.close();
    }

    public static char[][] erstelleFeld(int n) throws Exception {
        if (n < 12) {
            throw new Exception("Die Spaltenzahl muss mindestens 12 betragen");
        }
        if (n > 150) {
            // The field has a ratio of 3:2. When the height exceeds 100,
            // The spacing wont work correctly.
            // Since a width larger than 150 would result in a height larger than
            // 100, and therefore result in a misspaced field, this limit should
            // stay
            throw new Exception("Die Spaltenzahl darf höchstens 150 betragen");
        }

        // initialize field
        char[][] feld = new char[n * 2 / 3][n];
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                feld[i][j] = ' ';
            }
        }

        // draw R
        for (int i = 0; i < n / 2; i++) {
            // R starting line
            feld[1 + i][1] = '+';
        }
        for (int i = 0; i < n / 4; i++) {
            // R top and middle row
            feld[1][1 + i] = '+';
            feld[n / 4][1 + i] = '+';
        }
        for (int i = 0; i < n / 4; i++) {
            // R arc
            // Basically line that gehts mirrored, half-way.
            // this loop starts at n/4 + 0 and will move down-right, diagonally
            // until it will get mirrored at the vertically, at (n/4 + n/8)
            feld[1 + i][(i < n / 8) ? ((n / 4) + i) : ((n / 2) - i - 1)] = '+';
        }
        for (int i = n / 4; i <= n / 2; i++) {
            // R Diagonale
            feld[i][i - (n / 10)] = '+';
        }

        // draw E
        for (int i = 0; i < n / 2; i++) {
            // E starting line
            feld[i + 1][n / 2 + 1] = '+';
        }
        for (int i = 0; i < n / 4; i++) {
            // Top
            feld[1][n / 2 + 1 + i] = '+';
            // Bottom
            feld[n / 2][n / 2 + 1 + i] = '+';
            // Middle line (slightly shorter)
            // n * 3 / 16 = (n/4) - (n/16)
            feld[n / 4][n / 2 + 1 + i] = (i <= (n * 3 / 16)) ? '+' : ' ';
        }
        return feld;
    }
}
