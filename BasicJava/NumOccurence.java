// To find how many times a digit occur in a number
import java.util.Scanner;

public class NumOccurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the Number: ");
        int num = input.nextInt();
        System.out.print("Enter the Term: ");
        int term = input.nextInt();
        
        int test = 0 , digit ;
        
        while(num > 0){
            digit = num % 10;
            if(digit == term){
                test++;
            }
            num = num / 10;
        }
        
        System.out.println("the Term " + term + " occured " + test + " times ");
    }
    
}
