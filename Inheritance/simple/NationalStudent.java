public class NationalStudent extends Student {

    private String citizenshipNumber;

    public NationalStudent() {
        super();
        System.out.println("Default constructor of NationalStudent called!");
    }

    public NationalStudent(String name, String citizenshipNumber) {
        super(name);
        System.out.println("Parameterized constructor of NationalStudent called!");
        this.citizenshipNumber = citizenshipNumber;
    }

    public String getCitizenshipNumber() {
        return citizenshipNumber;
    }

    public void setCitizenshipNumber(String citizenshipNumber) {
        this.citizenshipNumber = citizenshipNumber;
    }

    @Override // Annotation
    public String getDetails() {
        return super.getDetails() + ", [ Citizenship Number: " + citizenshipNumber + " ]";
    }
    
}
