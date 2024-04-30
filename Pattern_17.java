public class Pattern_17 {
    static void pattern(int n){
        for(int i=0;i<n;i++){
            char c='A';

            // Spaces
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }

            // characters
            int breakpoint=(2*i+1)/2;
            for(int j=0;j<2*i+1;j++){
                System.out.print(c);

                if(j<breakpoint)
               c=(char)(c+1);
               else
               c=(char)(c-1);
                
            }

             // Spaces
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
           
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int n = 4;
        pattern(n);
    }
}
