public class Pattern {
    public static void main(String[] args) {
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print("0" + " ");
            }
            System.out.println();
        }
        for (int row = 0; row < 5; ++row) {
            for (int col = 0; col < row; ++col) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
