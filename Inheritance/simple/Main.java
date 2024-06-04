public class Main {

    public static void main(String[] args) {
        Student pranav = new Student("Pranav Panthi", 1, "KUSOM", "Male", "Madhyapur Thimi");
        Student gita = new Student("Gita", 2, "KUSOE", "Female", "Dhulikhel");
        pranav.printDetails();
        gita.printDetails();
        Student pramod = new Student();
        pramod.setName("Pramod Subedi");
        pramod.setAddress("Madhyapur Thimi");
        pramod.printDetails();
    }
    
}
