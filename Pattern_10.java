public class Pattern_10 {
    static void pattern_1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern_2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n-i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 5;
        pattern_1(n);
        pattern_2(4);
    }
}
