package Day7;

public class TwoDimiensionArray {
    public static void main(String[] args) {
         int[][]arr = new int [3][3];

    for(int i = 0; i<arr.length; i++) {
        for(int j = 0; j<arr.length; j++) {
            arr[i][j] = (int) (Math.random() * 10);
        }
    }

    for(int[] row : arr) {
        for(int i : row) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    }
}
