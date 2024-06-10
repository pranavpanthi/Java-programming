import java.util.Scanner;
public class Fibonacci {
    public static int rFibNum(int a, int b, int n) {
        if (n == 1) {
            return a;
        }
        if (n == 2) {
            return b;
        }
        else {
            return rFibNum(a, b, n - 1) + rFibNum(a, b, n - 2);    
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        System.out.println("Fibonacci : " + rFibNum(n, n, n));
    }    
}
