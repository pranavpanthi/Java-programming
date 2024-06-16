import java.util.ArrayList;
import java.sql.Date;

public class PartTimeTeacher extends Teacher {
    
    private double hourlyRate;
    
    private int totalTeachingHour;
    /*
     * a part time teacher should inherit the teacher class and have following attributes:
     * hourly rate
     * total teaching hours in a week
     */
    public PartTimeTeacher(String name, String address, String gender, Date dateOfBirth,ArrayList<String> subjects, double hourlyRate, int totalTeachingHour) {
        super(name, address, gender, dateOfBirth, subjects);
        this.hourlyRate = hourlyRate;
        this.totalTeachingHour = totalTeachingHour;

    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getTotalTeachingHour() {
        return totalTeachingHour;
    }

    public void setTotalTeachingHour(int totalTeachingHour) {
        this.totalTeachingHour = totalTeachingHour;
    } 
}
