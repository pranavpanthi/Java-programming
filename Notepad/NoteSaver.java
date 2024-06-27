import java.io.*;
import java.util.Scanner;

public class NoteSaver {
    public static void main(String[] args) {
        try {
            File f1 = new File("notepad.txt");
            Scanner input = new Scanner(System.in);
            
            System.out.println("Enter the note that you want to keep :");
            String note = input.nextLine();

            System.out.println("DO you want to save this note in the notepad[Yes/No] :");
            String response = input.nextLine();

            if (response.equalsIgnoreCase("yes")) {
                FileWriter writer = new FileWriter(f1, true);
                writer.write(note + "\n");
                writer.close();

                System.out.println("Notes Saved Successfully");
            } else {
                System.out.println("Note was not saved");   
            }

        } catch (Exception e) {
            System.out.println("An Error occured while saving the note");
            e.printStackTrace();
        }
        
    }
}
