package UE05;
import java.util.Scanner;

public class UE05A1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine ganze Zahl ein: ");
        int n = sc.nextInt();
        size(n);
        isEven(n);
        sc.close();
    }

    public static void size(int n) {
        if (n > 0) {
            System.out.println(n + " ist größer als 0");
        } else if (n == 0) {
            System.out.println(n + " ist 0");
        } else {
            System.out.println(n + " ist kleiner als 0");
        }
    }

    public static void isEven(int n) {
        if (n % 2 == 0) {
            System.out.print(n + " ist gerade.");
        } else {
            System.out.println(n + " ist ungerade");
        }
    }
}
