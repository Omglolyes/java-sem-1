package UE07;

// used to represent arrays in System.out, nothing else
import java.util.Arrays;

public class UE07A3 {
    public static void main(String args[]) {
        int[] erg = merge(new int[] { -2, 3, 9, 10 }, new int[] { 1, 5, 7, 9, -13 });
        System.out.println(Arrays.toString(erg));
    }

    public static int[] merge(int[] a, int[] b) {
        int[] ergebnis = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            ergebnis[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            ergebnis[a.length + i] = b[i];
        }
        sort(ergebnis);

        return ergebnis;
    }

    public static void sort(int[] c) {
        for (int i = 0; i < c.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < c.length; j++)
                if (c[j] < c[minIndex])
                    minIndex = j;
            int zw = c[i];
            c[i] = c[minIndex];
            c[minIndex] = zw;
        }

    }

    public static int[] mergeKoll(int[] a, int[] b) {
        int[] ergebnis = new int[a.length + b.length];
        int iA = 0;
        int iB = 0;
        for (int i = 0; i < ergebnis.length; i++) {
            if (iA >= a.length)
                ergebnis[i] = b[iB++];
            else if (iB >= b.length)
                ergebnis[i] = a[iA++];
            else if (a[iA] < b[iB])
                ergebnis[i] = a[iA++];
            else
                ergebnis[i] = b[iB++];
        }
        return ergebnis;
    }
}
