// package strings;

import java.util.Scanner;

public class StringDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println(name.equals("Pranav"));
        System.out.println(name.equalsIgnoreCase("Pranav")); // pranav PRANAV pRaNaV

        // method chaining
        boolean isPranav = sc.next().equalsIgnoreCase("Pranav");
        System.out.println("Is Pranav? : " + isPranav);
        
    }
    
}
