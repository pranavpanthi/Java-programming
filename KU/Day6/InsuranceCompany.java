package Day6;
import java.util.Scanner;
public class InsuranceCompany {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();

        System.out.println("DO you smoke (Yes / No): ");
        boolean smoke = input.next().equalsIgnoreCase("Yes");

        System.out.println("Enter number of valuation tickets: ");
        int ticket = input.nextInt();

        if (age>30 && smoke == true && ticket>= 3) {
            System.out.println("The licence has higher risks and cost more!!");
        }else {
            System.out.println("You have high chance for insurance quaification");
        }

        System.out.println("Are you graduated (Yes / No): ");
        boolean graduated = input.next().equalsIgnoreCase("Yes");

        if (30 < age && age >= 50 && graduated && ticket <= 1) {
            System.out.println("The licence has lower risks and cost less!");
        }else {
            System.out.println("You can't have the insurance");
        }

        System.out.println("Do you have a lung disease (Yes/No):");
        boolean lungDisease = input.next().equalsIgnoreCase("Yes");

        System.out.println("How many times you go to hospital :");
        int hospital = input.nextInt();

        if (age > 60 && lungDisease && hospital <= 5 ) {
            System.out.println("The insurance is in higher risk and could be rejected");
        }else {
            System.out.println("You can't have insurance");
        }
    }
}
