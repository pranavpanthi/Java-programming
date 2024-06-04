public class Student {
    // name, roll number, department, gender, address

    private String name;

    private int rollNumber;

    private String department;

    private String gender;

    private String address;

    // default constructor
    public Student() {
        System.out.println("Default constructor called!");
    }

    // constructor overloading
    // parameterized constructor
    public Student(String name, int rollNumber, String department, String gender, String address) {
        System.out.println("Parameterized constructor called!");
        setName(name);
        setRollNumber(rollNumber);
        setDepartment(department);
        setGender(gender);
        this.address = address;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() { 
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    } 
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void printDetails() {
        System.out.println("[ Name: " + getName() + ", Roll number: " + rollNumber + ", Department: " + department + 
                            ", Gender: " + gender + ", Address: " + address + " ]");
    }
}
