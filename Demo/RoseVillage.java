public class RoseVillage {
    
    private String homeOwner;

    private int homeNumber;

    public static void main(String[] args) {

        RoseVillage home1 = new RoseVillage();
        home1.homeOwner = "Pranav Panthi";
        home1.homeNumber = 1;

        RoseVillage home2 = new RoseVillage();
        home2.homeOwner = "Pramod Subedi"; 
        home2.homeNumber = 2;

        printDetails(home1.homeOwner, home1.homeNumber);
        
    }

    public static void printDetails(String homeOwner, int homeNumber) {
        System.out.println("Home Owner: " + homeOwner);
        System.out.println("Home Number: " + homeNumber);
    }
}
