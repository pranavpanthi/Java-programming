public class KUSOM {
    public static void main(String[] args) {
        Student pranav = new Student();
        pranav.name = "Pranav Panthi";
        pranav.rollNumber = 14;
        pranav.department = "School of Management";
        System.out.println(pranav.print());

        Student unique = new Student();
        unique.name = "Unique Poudel";
        unique.department = "School of Management";
        System.out.println(unique.print());
    }
}