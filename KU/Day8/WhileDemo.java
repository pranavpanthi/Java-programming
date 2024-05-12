package Day8;

public class WhileDemo {

    public static void main(String[] args) {
        // while loop
        int counter = 0;
        while (counter < 6) {
            System.out.println("printing");
            counter++;
            if (counter == 3) {
                break;
            }
        }
        // do while loop
        do {
            System.out.println("I am working");
            counter++;
        } while (counter < 3);    
    }
}
