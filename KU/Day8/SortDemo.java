package Day8;

public class SortDemo {
    
    public static void main(String[] args) {
        int [] arr = {4, 28, 32, 54, 67, 75, 2};

        for(int i = 0; i<arr.length; i++) {
            for(int j = 0; j< arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
