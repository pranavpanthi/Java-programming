import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // create three objects of part time teacher and full time teacher, and print their details
        ArrayList<String> subjects1 = new ArrayList<>();
        subjects1.add("Math");
        subjects1.add("English");

        ArrayList<String> subjects2 = new ArrayList<>();
        subjects2.add("History");
        subjects2.add("Physics");

        ArrayList<String> subjects3 = new ArrayList<>();
        subjects3.add("Chemistry");
        subjects3.add("Biology");

        PartTimeTeacher ptTeacher1 = new PartTimeTeacher("Pranav Panthi", "Balkot", "Male", new Date(), subjects1, 20, 50);
        PartTimeTeacher ptTeacher2 = new PartTimeTeacher("Pramod Subedi", "Thimi", "Male", new Date(), subjects2, 30, 60);
        PartTimeTeacher ptTeacher3 = new PartTimeTeacher("Prahlad Panthi", "Camberra", "Male", new Date(), subjects1, 20, 50);
        
        // FullTimeTeacher ftTeacher1 = new FullTimeTeacher("Chandra Shekhar Panthi", "Balkot", "Male", new Date(), subjects1, 50000, 10);
        // FullTimeTeacher ftTeacher2 = new FullTimeTeacher("Sita Subedi Panthi", "Thimi", "Female", new Date(), subjects2, 200000, 20);
        // FullTimeTeacher ftTeacher3 = new FullTimeTeacher("Prahlad Panthi", "Balkot", "Male", new Date(), subjects3, 250000, 15);
        
        System.out.println(ptTeacher1);
        System.out.println(ptTeacher2);
        System.out.println(ptTeacher3);

        // System.out.println(ftTeacher1);
        // System.out.println(ftTeacher2);
        // System.out.println(ftTeacher3);

    }
}
