import java.io.*;
import java.util.Scanner;
public class UsingScanner {
    public static void main(String[] args) {
        try {
            File f1 = new File("Output.txt");
            Scanner sc = new Scanner(f1);
            while (sc.hasNext()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
