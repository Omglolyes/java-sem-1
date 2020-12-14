package UE07;

// used to represent arrays in System.out, nothing else
import java.util.Arrays;

public class UE07A3 {
    public static void main(String args[]) {
        int[] a = merge(new int[] { -2, 3, 9, 10 }, new int[] { 1, 5, 7 });
        System.out.println(Arrays.toString(a));
    }

    public static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        for (int n = 0; n <= a.length - 1; n++) {
            c[n] = a[n];
        }
        for (int n = 0; n <= b.length - 1; n++) {
            c[a.length + n] = b[n];
        }
        c = arraySort(c);
        return c;
    }

    public static int[] arraySort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = (i + 1); j < a.length; j++) {
                // if current pos is greater, swap it with the next pos
                if (a[i] > a[j]) {
                    int x = a[i];
                    a[i] = a[j];
                    a[j] = x;
                }
            }
        }
        return a;
    }
}
