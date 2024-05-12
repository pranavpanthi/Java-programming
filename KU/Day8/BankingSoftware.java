package Day8;

public class BankingSoftware {
    String name;

    String type;

    long number;

    int balance;

    public BankingSoftware(String name, String type, long number, int balance) {
        this.name = name;
        this.type = type;
        this.number = number;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }
    
    public void withdraw(int amount) {
        balance -= amount;
    }
    
    public void CheckBalance() {
        System.out.println("Your balance is: " + this.balance);
    }



}
