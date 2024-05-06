package Day7;

import java.util.Arrays;

public class OneDimentionArray {
    public static void main(String[] args) {
        int [] arr = new int[5];

        for(int i = 0; i<arr.length;i++) {
            
            arr[i] = (int)(Math.random() * 10);
        }
        for(int j : arr ) {
            System.out.println(j);
        }

        System.out.println(Arrays.toString(arr));
    }
}
