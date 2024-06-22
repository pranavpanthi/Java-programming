import java.sql.Date; // todo: need to change it to java.util.Date as you are passing java.util.Date object from the main class
import java.util.ArrayList;

public class Teacher {

    /* a teacher should have following attributes:
        name
        address
        gender
        date of birth (date format)
        subjects (in a list - see Java ArrayList)
        Also, have a constructor and getters and setters
    */
    private String name;

    private String address;

    private String gender;

    private Date dateOfBirth;

    private ArrayList<String> subjects;
    
    public Teacher(String name, String address, String gender, Date dateOfBirth, ArrayList<String> subjects) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.subjects = subjects;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getdateOfBirth() {
        return dateOfBirth;
    }

    public void setdateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }

}
