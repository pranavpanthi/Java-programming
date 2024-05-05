package Day6;

import javax.swing.table.TableStringConverter;

public class MachineObject {

    public static void main(String[] args) {
        VendingMachine toys = new VendingMachine();
        toys.ItemName = "Toys";
        toys.NumberOfItem = 10;
        toys.AmountOfItem = 25;

        VendingMachine tablet = new VendingMachine();
        tablet.ItemName = "Tablet";
        tablet.NumberOfItem = 50;
        tablet.AmountOfItem = 5;

        VendingMachine phone = new VendingMachine();
        phone.ItemName = "Android";
        phone.NumberOfItem = 20;
        phone.AmountOfItem = 500;

        printDetailsUsingObject(toys);
        printDetailsUsingObject(tablet);
        printDetailsUsingObject(phone);

        public static void printDetailsUsingObject(VendingMachine machine) {
            System.out.println("Item Name: " + machine.ItemName);
            System.out.println("Number of Item: " + machine.NumberOfItem);
            System.out.println("Amount of Item: " + machine.AmountOfItem);
    }
}
