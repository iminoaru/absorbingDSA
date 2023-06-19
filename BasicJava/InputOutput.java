import java.util.Scanner ; //have to include this class to take input

public class InputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);      //define the input (system.in means that we  
        System.out.print("Enter the Number: ");   //are taking input from keyboard)
        int number = input.nextInt();               // taking the input in variable named number
        System.out.println("The Entered number is " + number); //printing the input
    }
}
//print takes input in same line
//println takes input in new line