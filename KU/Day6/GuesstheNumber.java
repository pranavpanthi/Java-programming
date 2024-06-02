import java.util.Scanner;
public class GuesstheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int random = (int)(Math.random() * 10) + 1;
        System.out.println("Enter the Lucky number : ");
        int a = input.nextInt();
        if (random == a) {
            System.out.println("Congratulation You won!!!!");
        }else{
            System.out.println("Try again your luck is nearing!!!");
        }
        System.out.println(random);
        
    }
}
