package Day6;
import java.util.Scanner;
public class CalculatorWithLoop {
    public static double add(double a, double b, double c, double d) {
        return ((a + b) + c) + d;
    }

    public static double substract(double a, double b, double c, double d) {
        return ((a - b) - c) - d;
    }

    public static double multiply(double a, double b, double c, double d) {
        return ((a * b) * c) * d;
    }

    public static double divide(double a, double b, double c, double d) {
        return ((a / b) / c) / d;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        double a = input.nextDouble();

        System.out.println("Enter the first number : ");
        double b = input.nextDouble();

        System.out.println("Enter the first number : ");
        double c = input.nextDouble();

        System.out.println("Enter the first number : ");
        double d = input.nextDouble();
        
        System.out.println("Enter the arthematic operator (+, -, *, /): ");
        String op = input.next();

        if (op.equals("+")) {
            System.out.println("Addition: " + add(a, b, c, d));
        }else if(op.equals("+")) {
            System.out.println("Substraction: " + substract(a, b, c, d));
        }else if (op.equals("*")) {
            System.out.println("Multiplication: " + multiply(a, b, c, d));
        }else if (op.equals("/")) {
            System.out.println("Division: " + divide(a, b, c, d));            
        }else{
            System.out.println("Input error!!!");
        }
    }
}

