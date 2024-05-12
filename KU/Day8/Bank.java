package Day8;
import java.util.*;
public class Bank {

        /*Bank pranav = new Bank();
        pranav.name = "Pranav";
        pranav.type = "Saving";
        pranav.amount = 13315424;
        pranav.balance = 233423432;
        
        Bank pramod = new Bank();
        pramod.name = "Pramod";
        pramod.type = "Saving";
        pramod.amount = 243243;
        pramod.balance = 354233;

        Bank prahlad = new Bank();
        prahlad.name = "Prahlad";
        prahlad.type = "Saving";
        prahlad.amount = 99999999;
        prahlad.balance = 99999999;
        
        print(pranav);
        print(pramod);
        print(prahlad);
    }

    public static void print(Bank name) {
        System.out.println("Name: " + name.name);
        System.out.println("Type: " + name.type);
        System.out.println("Amount: " + name.amount);
        System.out.println("Balance: " + name.balance);
    } */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Account name: ");
        String name = input.nextLine();

        System.out.println("Enter your Account type: ");
        String type = input.nextLine();

        System.out.println("Enter your Account number: ");
        long number = input.nextLong();

        System.out.println("Enter your Account balance: ");
        int balance = input.nextInt();

        BankingSoftware pranav = new BankingSoftware (name, type, number, balance);
            pranav.CheckBalance();
            pranav.deposit(1000000);
            pranav.CheckBalance();
        }
    }
