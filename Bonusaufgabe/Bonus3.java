package Bonusaufgabe;

import java.util.Scanner;

public class Bonus3 {
    public static void main(String args[]) throws Exception {
        // char[][] field = Bonusaufgabe.GameOfLife.testField();
        char[][] field = Bonusaufgabe.Bonus1.erstelleFeld(50);
        Bonusaufgabe.utils.printField(field);
        System.out.println("Anzahl Generationen: ");
        Scanner sc = new Scanner(System.in);
        gameOfLife2(field, sc.nextInt());
        sc.close();
    }

    public static void gameOfLife2(char[][] field, int t) {
        for (int step = 0; step < t; step++) {
            field = nextGen(field, step);
            Bonusaufgabe.utils.printField(field);
        }
    }

    private static char[][] nextGen(char[][] field, int step) {
        char[][] newField = new char[field.length][field.length];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                newField[i][j] = cellIsLive_5(field, i, j, step) ? '+' : '-';
            }
        }
        return newField;
    }

    private static boolean cellIsLive_5(char[][] field, int x, int y, int step) {
        int liveNeighbours = 0;
        int liveOuterNeighbours = 0;

        for (int i = x - 1; i < x + 2; i++) { // Inner cells
            for (int j = y - 1; j < y + 2; j++) {
                try {
                    if (field[i][j] == '+' && (!(i == x && j == y))) {
                        ++liveNeighbours;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    // assume '-' for outside of border
                    // just dont count it
                }
            }
        } // Inner cells

        { // Outer cells
            for (int i = x - 2; i < x + 3; i++) {
                try {
                    if (field[i][y - 2] == '+' || field[i][y + 2] == '+') {
                        ++liveOuterNeighbours;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    // assume '-' for outside of border
                }
            }
            for (int i = y - 1; i < y + 2; i++) {
                try {
                    if (field[x - 2][i] == '+' || field[x + 2][i] == '+') {
                        ++liveOuterNeighbours;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    // assume '-' for outside of border
                }
            }
        } // Outer cells

        if (liveOuterNeighbours + (2 * liveOuterNeighbours) > 10)
            return false;
        if (liveOuterNeighbours > step / 3)
            return true;
        if (liveNeighbours == 3)
            return true;
        if (liveNeighbours == 2 && field[x][y] == '+')
            return true;
        return false;
    }
}
