import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Nth Term: ");
        int num = input.nextInt();
        int a=0 , b=1 , c ;
        
        for(int i = 2 ; i <= num ; i++){
            c = b;
            b =a + b;
            a = c;
        }
        
        System.out.println("Nth Term is: " + b);
    }
    
}
