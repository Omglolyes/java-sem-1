package UE07;

public class UE07A1 {
    public static void main(String args[]) {
        geometrischeSumme(4, 3);
    }

    public static void geometrischeSumme(int q, int n) {
        int i = 0;
        int sum = 1;
        while (n > i++) {
            sum += exponent(q, i);
        }
        System.out.println(sum);
    }

    public static int exponent(int a, int b) {
        int result = 1;
        while (b-- >= 0) {
            result = result * a;
        }
        return result;
    }
}
