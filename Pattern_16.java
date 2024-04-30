public class Pattern_16 {
    static void pattern(int n){
        char c='A';
        for(int i=0;i<n;i++){
           
            for(int j=0;j<=i;j++){
                System.out.print(c+" ");
                
            }
            c = (char) (c + 1);
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int n = 5;
        pattern(n);
    }
}
