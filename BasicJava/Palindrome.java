import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        
        int num = number; //storing original 'number' in 'num'
        int result = 0, digit;
        
        while(num != 0){
            digit = num % 10 ;
            result = result * 10 + digit;
            num = num / 10;
        }
        
        if(number == result){
            System.out.println("The number is Palindrome");
        }
        else{
            System.out.println("The number isn't Palindrome");
        }
    }    
}
