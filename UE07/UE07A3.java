package UE07;

// used to represent arrays in System.out, nothing else
import java.util.Arrays;

public class UE07A3 {
    public static void main(String args[]) {
        int[] erg = merge(new int[] { -2, 3, 9, 10 }, new int[] { 1, 5, 7, 9, -13 });
        System.out.println(Arrays.toString(erg));
    }

    public static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int z1 = 0;
        int z2 = 0;

        for (int n = 0; n < c.length; n++) {
            c[n] = (z1 < a.length && z2 < b.length && a[z1] < b[z2]) ? a[z1++] : b[z2++];
            // TODO: Von Phil unsere Lösung holen
        }
        return c;
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
