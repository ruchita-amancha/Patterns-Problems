public class Pattern_20 {
    static void pattern(int n) {
        for (int i = 1; i <=(2*n)-1; i++) {
            int stars=i;
            if(n<i){
                 stars=(2*n-i);
            }
            
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i <(2*n)-1; i++) {
            int stars=i;
            if(n<i){
                 stars=(2*n-i);
            }
            
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 5;
        pattern(n);
    }
}
