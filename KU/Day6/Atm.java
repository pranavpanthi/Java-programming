package Day6;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter 1 for deposit");
            System.out.println("Enter 2 for withdraw");
            System.out.println("Enter 3 for leave");
            int num = input.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Enter amount you want to deposit");
                    int amount= input.nextInt();
                    System.out.println("The amount deposited is : " + amount);
                    System.out.println("Thank you Please collect your receipt!!!");
                    break;
                case 2:
                    System.out.println("Enter amount you want to Withdraw");
                    int a = input.nextInt();
                    System.out.println("The amount withdrawn is : " + a);
                    System.out.println("Thank you Please collect your money!!!");
                    break;
                case 3:
                    System.out.println("Thank you for choosing...... ATM");
                    break;
                default:
                    System.out.println("Enter valid Option!!!");
                    break;
            }
        }
    }
}
