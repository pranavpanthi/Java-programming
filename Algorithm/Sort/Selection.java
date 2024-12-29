import java.util.Arrays;

public class Selection {

    public static void selectsort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 300, 8, 5, 9, -2, -5, 45, 6 };
        selectsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}