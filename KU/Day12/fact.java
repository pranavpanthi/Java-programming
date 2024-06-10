import java.util.Scanner;
public class fact {
    public static int fact(int num) {
        if(num == 0) {
            return 1;
        }
        else {
            return num * fact(num - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = input.nextInt();
        System.out.println("Fact :" + fact(num));
    }
}
