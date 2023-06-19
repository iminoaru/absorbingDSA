import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int test = 0 , i = 1;
        while(i != num ){
            if(num % i == 0){
                test++;
            }
            i++;
        }
        if(test==1 && num != 1){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }   
}
