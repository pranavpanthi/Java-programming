package Day8;

public class Constructor {
    String name;
    String address;
    long phone;

    public Constructor(String name) {
        this.name = name;
        System.out.println(name);
    }

    public Constructor(String name, String address) {
        this.name = name;
        this.address = address;
        System.out.println(name + " " + address);
    }

    public Constructor(String name, String address, long phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        System.out.println(name + " " + address + " " + phone);
    }
}
