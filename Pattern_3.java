public class Pattern_3{

    static void pattern(int n){
        for (int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
            System.out.print(j+" ");
           }
            System.out.println();
        }
    }

    static void method2(int n){
        for (int i=0;i<=n;i++){
           for(int j=0;j<i;j++){
            System.out.print(j+1 +" ");
           }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int n=4;
        pattern(n);
        method2(n);
    }
}