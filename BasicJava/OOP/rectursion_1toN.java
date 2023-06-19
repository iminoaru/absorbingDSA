public class rectursion_1toN {
    public static void main(String[] args){
        
        // oneToN(10);
        // revOneToN(10);
        System.out.println(sumOfNum(10));
    }

    static void oneToN(int n){
        if(n == 0) return;

        oneToN(n-1);
        System.out.println(n);
    }

    static void revOneToN(int n){
        if(n == 0) return;

        System.out.println(n);
        revOneToN(n-1);    
    }

    static int sumOfNum(int n){
        if(n < 1) return 0;

        return sumOfNum(n-1) + n;
    }

}
