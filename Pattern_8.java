public class Pattern_8 {
    static void pattern(int n) {
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
        pattern(n);
    }
}
