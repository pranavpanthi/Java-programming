package Day14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exception {
    public static void readFile(String filename) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("File name not found");
                }
            }
        }
    }
    public static void main(String[] args) {
        try {
            readFile("test.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("I would eun in any case");
        }
    }
}
