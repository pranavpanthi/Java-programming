public class RoseVillage {
    
    private String homeOwner;

    private int homeNumber;

    private int numberOfFloor;

    private static int totalHomes = 0;

    public static void printTotalHomes() {
        System.out.println("Total homes = " + totalHomes);
    }

    public static void main(String[] args) {

        RoseVillage home1 = new RoseVillage();
        home1.homeOwner = "Pranav Panthi";
        home1.homeNumber = 1;
        home1.numberOfFloor = 3;
        RoseVillage.totalHomes += 1;

        RoseVillage home2 = new RoseVillage();
        home2.homeOwner = "Pramod Subedi"; 
        home2.homeNumber = 2;
        home2.numberOfFloor = 2;
        RoseVillage.totalHomes += 1;

        RoseVillage home3 = new RoseVillage();
        home3.homeOwner = "Prahlad Panthi";
        home3.homeNumber = 3;
        home3.numberOfFloor = 1;
        RoseVillage.totalHomes += 1;

        // RoseVillage.printDetailsUsingAttributes(home1.homeOwner, home1.homeNumber, home1.numberOfFloor);
        // printDetailsUsingAttributes(home2.homeOwner, home2.homeNumber, home2.numberOfFloor);
        // printDetailsUsingAttributes(home3.homeOwner, home3.homeNumber, home3.numberOfFloor);

        // printDetailsUsingObject(home1);
        // printDetailsUsingObject(home2);
        // printDetailsUsingObject(home3);

        // System.out.println("Printing two details of home togather : ");

        // printDetails(home1, home2);
        // printDetails(home3, home3);

        RoseVillage.printTotalHomes();
        home1.totalHomes = 10;
        home1.printTotalHomes();
        home2.printTotalHomes();

    }

    public static void printDetailsUsingAttributes(String homeOwner, int homeNumber, int numberOfFloor) {
        System.out.println("Home Owner: " + homeOwner);
        System.out.println("Home Number: " + homeNumber);
        System.out.println("Number of Foors: " + numberOfFloor);
    }
    
    public static void printDetailsUsingObject(RoseVillage home) {
        System.out.println("Home Owner: " + home.homeOwner);
        System.out.println("Home Number: " + home.homeNumber);
        System.out.println("Number of Foors: " + home.numberOfFloor);
    }

    public static void printDetails(RoseVillage h1, RoseVillage h2) {
        System.out.println("Home Owner: " + h1.homeOwner);
        System.out.println("Home Number: " + h1.homeNumber);
        System.out.println("Number of Foors: " + h1.numberOfFloor);
        System.out.println("Home Owner: " + h2.homeOwner);
        System.out.println("Home Number: " + h2.homeNumber);
        System.out.println("Number of Foors: " + h2.numberOfFloor);
    } 
}
