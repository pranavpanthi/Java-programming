import java.io.*;
public class ReadingFromFile {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("Output.txt");
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
    }
}
