import java.util.Scanner ;

public class Sum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //basic line to just introduce input function
        System.out.print("Enter the two numbers: ");
        int num_1 = input.nextInt(); // input number 1
        int num_2 = input.nextInt(); // input number 2

        int Sum = num_1 + num_2 ;
        System.out.println("The sum is: " + Sum);    }
    
}
