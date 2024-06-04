public class Student {
    // name, roll number, department, gender, address

    private String name;

    private int rollNumber;

    private String department;

    private String gender;

    private String address;

    // default constructor
    public Student() {
        System.out.println("Default constructor of Student called!");
    }

    public Student(String name) {
        System.out.println("Parameterized constructor of Student which takes just name called!");
        this.name = name;
    }

    // constructor overloading
    // parameterized constructor
    public Student(String name, int rollNumber, String department, String gender, String address) {
        System.out.println("Parameterized constructor of Student called!");
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

    public String getDetails() {
        return "[ Name: " + getName() + ", Roll number: " + rollNumber + ", Department: " + department + 
                            ", Gender: " + gender + ", Address: " + address + " ]";
    }
}
