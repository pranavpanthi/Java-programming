import java.util.Scanner;

public class ConvertCurrency {

    static int usd = 134;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the currency NPR or USD ");
        String currency= input.nextLine();
        switch (currency) {
            case "USD":
                System.out.println("Enter US amount you want to change to NPR ");
                float u = input.nextFloat();
                float c = u*usd;
                System.out.println("Your currency is NPR " + c);
                break;
            case "NPR":
                System.out.println("Enter NPR amount you want to change to US ");
                float m = input.nextFloat();
                float n = m/usd;
                System.out.println("Your currency is USD " + n);
                break;
        
            default:
            System.out.println("Error!!");
                break;
        }
    }
}
