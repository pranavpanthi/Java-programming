import java.io.*;
import java.util.Scanner;

public class NoteSaver {
    public static void main(String[] args) {
        try {
            File f1 = new File("notepad.txt");
            Scanner input = new Scanner(System.in);

            System.out.println("Choose \n1. Write Note \n2. Read Note \n3. Exit\n");
            int choice = input.nextInt();
            switch (choice) {
                case 1: 
                    try {
                        input.nextLine();
                        System.out.println("Enter the note that you want to keep: ");
                        String note = input.nextLine();

                        System.out.println("Do you want to save the note in the notepad [Yes/No]: ");
                        String response = input.next();
    
                        if (response.equalsIgnoreCase("yes")) {
                            FileWriter writer = new FileWriter(f1, true);
                            writer.write("\n" + note + "\n");
                            writer.close();
                    
                        System.out.println("Note Saved Sucessfully !!!\n");
                        } else {
                            System.out.println("Note not Saved !!!\n");
                        }
                    } catch (Exception e) {
                        System.out.println("Error has been occured!!!");
                    }
                    break;
                case 2:
                    try {
                        FileReader fr = new FileReader("notepad.txt");
                        BufferedReader br = new BufferedReader(fr);
                        String line;
                        while ((line = br.readLine()) != null) {
                            System.out.println(line);
                        }
                        br.close();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        e.getMessage();
                    }
                break;
                
                case 3:
                    System.out.println("The File has been exited !!!");
                    input.close();
                    break;

                default:
                    System.out.println("Error in Notepad !!!");
                    break;
            }
        } catch (Exception e) {
            System.out.println("AN error has occured while saving the note !!!");
        }
    }
}
