package Day6;
import java.util.Scanner;

public class interest {
    static float r = 12f;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter principal :");
        int p = input.nextInt();

        System.out.println("Enter Time period :");
        int t = input.nextInt();

        float i = (p*t*r)/100;
        System.out.println("The interest is :" + i);
        System.out.println("Pay interest in time!!!");

    }
}
