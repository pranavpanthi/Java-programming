import java.io.*;

public class NotepadManager {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("notepad.txt");
            BufferedWriter bfw = new BufferedWriter(fw);
            String str1 = "---------------WELCOME !!!-------------\n";
            bfw.write(str1);
            String str2 = "------------------TO-------------------\n";
            bfw.write(str2);
            String str3 = "---------------NOTEPAD !!!-------------\n";
            bfw.write(str3);
            
            System.out.println("File Written");
            bfw.close();

        } catch (Exception e) {
            System.out.println("AN SYSTEM ERROE HAS OCCURED!!!");
        }
    }
}
