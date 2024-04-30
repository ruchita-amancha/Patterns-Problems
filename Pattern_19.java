public class Pattern_19 {
    static void pattern_1(int n){
        for(int i=0;i<n;i++){

            // star
            for(int j=0;j<(n-i);j++){
                System.out.print("*");
            }

            // spaces
            for(int j=0;j<2*i;j++){
                System.out.print(" ");
            }

            // star
            for(int j=0;j<(n-i);j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
    static void invertedPattern(int n){
        for(int i=0;i<n;i++){

            // star
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }

            // spaces
            for(int j=0;j<2*(n-i)-2;j++){
                System.out.print(" ");
            }

            // star
            for(int j=0;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int n = 5;
        pattern_1(n);
        invertedPattern(n);
    }
}
