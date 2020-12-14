package UE07;

public class UE07A2 {
    public static void main(String args[]) {
        Weihnachtsbaum(18);
    }

    public static void Weihnachtsbaum(int n) {
        if (n < 1) {
            System.out.println("Please enter a positive number.");
            return;
        }

        for (int i = 0; i <= n; i++) {
            printSpaces(i, n);
            plantTree(i, n);
            System.out.println("*");
        }
    }

    public static void printSpaces(int i, int n) {
        for (int j = 0; j <= n - i; j++) {
            System.out.print(" ");
        }
    }

    public static void plantTree(int i, int n) {
        for (int j = 0; j / 2 < i; j++) {
            System.out.print("*");
        }
    }
}
