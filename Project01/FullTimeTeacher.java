import java.sql.Date;
import java.util.ArrayList;

public class FullTimeTeacher extends Teacher {
    /*
    a full time teacher should inherit teacher class and have following attributes:
    salary, total hours of leave
     */ 
    private int salary;

    private int totalHourOfLeave;
     
    public FullTimeTeacher(String name, String address, String gender, Date dateOfBirth, ArrayList<String> subjects, int salary, int totalHourOfLeave) {
        super(name, address, gender, dateOfBirth, subjects);
        this.salary = salary;
        this.totalHourOfLeave = totalHourOfLeave;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getTotalHourOfLeave() {
        return totalHourOfLeave;
    }

    public void setTotalHourOfLeave(int totalHourOfLeave) {
        this.totalHourOfLeave = totalHourOfLeave;
    }
   
}
