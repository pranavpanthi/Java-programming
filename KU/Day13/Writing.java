import java.io.BufferedWriter;
import java.io.FileWriter;
public class Writing {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("Output.txt", true);
            BufferedWriter bfw = new BufferedWriter(fw);
            String str1 = "This is to output lines into files\n";
            bfw.write(str1);
            String str2 = "Adding more onto it\n";
            bfw.write(str2);
            String str3 = "You can many lines";
            bfw.write(str3);

            System.out.println("File Written");
            bfw.close();
        }
        catch(Exception e) {
            System.out.println("File not found");    
        }
    }
}
