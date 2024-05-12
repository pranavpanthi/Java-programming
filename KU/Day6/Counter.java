package Day6;
import java.util.Scanner;
public class Counter {
    static int counter = 0;
    static int [] cde = new int[10];
    public static void main(String[] args) {
        Counter m = new Counter();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter items : ");
        for (int i = 0; i<cde.length; i++) {
            cde[i] = input.nextInt();
            counter++;
        }
        System.out.println(counter);
    }
}
