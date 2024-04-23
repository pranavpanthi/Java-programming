public class KUSOMTeacher {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.name = "Pranav Panthi"; 
        teacher1.Dep = "School of management ";
        System.out.println(teacher1.print());

        Teacher teacher2 = new Teacher();
        teacher2.name = "Narayan Niraula";
        teacher2.Dep = "School of management ";
        System.out.println(teacher2.print());
    }
}
