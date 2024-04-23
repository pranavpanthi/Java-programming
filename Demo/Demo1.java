public class Demo1 {

    String name = "Pranav";
    String department = "School of Management";
    static int age = 18;

    public static void main(String[] args) {
        Demo1 pranav = new Demo1();
        System.out.println("Name = " + pranav.name);
        System.out.println("Department = " + pranav.department);
        System.out.println("Age using object = " + pranav.age);
        System.out.println("Age using class = " + Demo1.age);
        
    }    
}
