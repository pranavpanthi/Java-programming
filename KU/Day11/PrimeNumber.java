package Day11;

public class PrimeNumber {
    static boolean isprime(int input) {
        if (input<= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(input); i++) {
            if (input % i == 0) {
                return false;
            }            
        }
        return true;
    } 
    public static void main(String[] args) {
        System.out.println(isprime(1));
    }
}
