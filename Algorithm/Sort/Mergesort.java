import java.util.Arrays;

public class Mergesort {
    public static void mergesort(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && i < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                k++;
                i++;
            } else {
                c[k] = b[i];
                k++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 2, 20, 110, 200 };
        int[] b = { 2, 25, 100, 150 };
        int[] c = {};
        mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
