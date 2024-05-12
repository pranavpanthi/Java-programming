// package scanner;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        boolean isCurrentStudent;
        double feesPaid;
        // methods 

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter age: ");
        age = sc.nextInt();

        System.out.print("Are they current student? : ");
        isCurrentStudent = sc.nextBoolean();

        System.out.print("Enter fees paid amount: ");
        feesPaid = sc.nextDouble();

        System.out.println("[ Name: " + name + ", age: " + age + ", is current student: " + isCurrentStudent + ", Fees Paid: " + feesPaid + " ]");
        
    }
    
}
