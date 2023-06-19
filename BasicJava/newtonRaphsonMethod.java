// an algo used to guess the square root of a number.


public class newtonRaphsonMethod {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }

    static double sqrt(int n){
        double x = n; // x is our guessed root
        double root; 
        while(true){
            root = (x + (n/x)) * 0.5;
            double precision = 0.2; // the more you decrese the precision the more time will be taken.
            if(Math.abs(root - x) < precision){  
                break;
            }
            else{
                x = root;
            }
        }
        return root;
    }
}
