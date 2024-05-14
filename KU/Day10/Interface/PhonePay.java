public class PhonePay implements TopUpable {
    public void topUp(int amount, long phoneNumber) {

        System.out.println("Your phone: " + phoneNumber + " has been topup by: " + amount);
        
    }
    public static void main(String[] args) {
        PhonePay pay = new PhonePay();
        pay.topUp(300, 984392906);
    }
}
