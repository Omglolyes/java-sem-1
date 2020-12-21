package UE07;

public class UE07A1 {
    public static void main(String args[]) {
        System.out.println(geometrischeSumme2(4, 3));
    }

    public static int geometrischeSumme(int q, int n) {
        int sum = 1;
        int qn = q;
        for (int i = 0; i < n; i++) {
            sum += q;
            q *= qn;
        }
        return (sum);
    }

    public static int geometrischeSumme2(int q, int n) {
        // https://www.wolframalpha.com/input/?i=sum+q%5Ei%2C+i%3D0+to+n
        int qnPower = 1;
        for (int i = 0; i <= n; i++) {
            qnPower *= q;
        }

        return ((qnPower - 1) / (q - 1));
    }
}
