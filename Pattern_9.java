public class Pattern_9 {
    static void pattern_7(int n) {
        for (int i = 0; i < n; i++) {

            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
    static void pattern_8(int n) {
        for (int i = 0; i < n; i++) {

            // space
            for (int j = 0; j < i; j++) {
                
                    System.out.print(" ");
                
                
            }

            // star
            for (int j = 0; j < 2 * (n-i-1) + 1; j++) {
                System.out.print("*");
            }

            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
    public static void main(String args[]) {
        int n = 5;

        // combination of pattern 7 and 8
        pattern_7(n);
        pattern_8(n);
    }
}
