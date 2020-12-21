package UE07;

public class UE07A2 {
    static int kugel = 0;
    public static void main(String args[]) {
        
        Weihnachtsbaum(18);
    }

    public static void Weihnachtsbaum(int n) {
        if (n < 1) {
            System.out.println("Please enter a positive number.");
            return;
        }

        for (int i = 0; i < n; i++) {
            printSpace(n, i);
            printTree(n, i);
            System.out.println("*");
        }

        
    }
    public static void printSpace(int n, int i){
        for (int j = 0; j < n - i - 1; j++) {
            System.out.print(" ");
        }
    }
    public static void printTree(int n, int i){
        for (int j = 0; j / 2 < i; j++) {
            System.out.print((++kugel % 10 == 0) ? "o" : "*");
        }
    }
}
