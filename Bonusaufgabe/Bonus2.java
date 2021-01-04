package Bonusaufgabe;

import java.util.Scanner;

public class Bonus2 {
    public static void main(String[] args) {
        char[][] field = Bonusaufgabe.utils.testField();
        Bonusaufgabe.utils.printField(field);
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie n für die Zeilen/- Spaltenzahl ein: ");
        gameOfLife(field, sc.nextInt());
        sc.close();
    }

    public static void gameOfLife(char[][] field, int t) {
        for (int step = 0; step < t; step++) {
            field = nextGen(field);
            System.out.println("Gen: " + (step + 1));
            Bonusaufgabe.utils.printField(field);
        }
    }

    private static char[][] nextGen(char[][] field) {
        char[][] newField = new char[field.length][field.length];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                newField[i][j] = cellIsLive(field, i, j) ? '+' : '-';
            }
        }
        return newField;
    }

    private static boolean cellIsLive(char[][] field, int x, int y) {
        int liveNeighbours = 0;
        for (int i = x - 1; i < x + 2; i++) {
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
        }
        return (liveNeighbours == 3 || (liveNeighbours == 2 && field[x][y] == '+')) ? true : false;
    }
}