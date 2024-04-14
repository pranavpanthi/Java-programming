public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator casio = new Calculator();
        System.out.println("Adding 10 and 5: " + casio.add(10,5));
        System.out.println("Substract 10 and 5: " + casio.substract(10, 5));
        System.out.println("Product of 10 and 5: " + casio.multiply(10, 5));
        System.out.println("Division of 10 and 5: " + casio.divide(10, 5)); 
    }
}