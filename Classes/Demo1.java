public class Demo1 {
    String test = "Test";
    public String setTest() {
        return test;
    }

    public static void main(String[] args) {
        Demo1 Hello = new Demo1(); // object
        System.out.println(Hello.setTest());
    }
}
