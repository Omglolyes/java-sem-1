package UE05;
import java.util.Scanner;

public class UE05A3 {
    public static void test(String args[]) {
        for (int i = -2; i < 10; i++) {
            String bin = dezimalInBinär(i);
            System.out.println(bin);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein: ");
        int n = sc.nextInt();
        System.out.println(dezimalInBinär(n));
        sc.close();
    }

    public static String dezimalInBinär(int n) {
        String bin = "";
        if (n <= 0) {
            return "0";
        }
        while (n > 0) {
            bin = n % 2 + bin;
            n /= 2;
        }
        return bin;
    }
}
