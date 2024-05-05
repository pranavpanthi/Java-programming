import java.util.Scanner;
public class VendingMachineDemo {
    static int toys = 20;
    static int tablets = 10;
    static int phone = 100;
    static int pen = 5;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 for toys : ");
        System.out.println("Enter 2 for tablets : ");
        System.out.println("Enter 3 for phone : ");
        System.out.println("Enter 4 for pen : ");
        int choose = input.nextInt();
        switch (choose) {
            case 1:
                System.out.println("You choosed toy");
                System.out.println("Your payment will be 20");
                int pmt01= input.nextInt();
                int chng01 = pmt01 - toys;
                System.out.println("Your change is : " + chng01);
                System.out.println("Thank you for choosing us!");
                break;
            case 2:
                System.out.println("You choosed tablet");
                System.out.println("Your payment will be 10");
                int pmt02= input.nextInt();
                int chng02 = pmt02 - tablets ;
                System.out.println("Your change is : " + chng02);
                System.out.println("Thank you for choosing us!");
                break;
            case 3:
                System.out.println("You choosed phone");
                System.out.println("Your payment will be 100");
                int pmt03= input.nextInt();
                int chng03 = pmt03 - phone ;
                System.out.println("Your change is : " + chng03);
                System.out.println("Thank you for choosing us!");
                break;
            case 4:
                System.out.println("You choosed pen");
                System.out.println("Your payment will be 5");
                int pmt04= input.nextInt();
                int chng04 = pmt04 - pen ;
                System.out.println("Your change is : " + chng04);
                System.out.println("Thank you for choosing us!");
                break;
            default:
                System.out.println("Valid Number !!!");
                break;
        } 

    }
}
