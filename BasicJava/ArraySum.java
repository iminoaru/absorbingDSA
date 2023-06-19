import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr;
        int sum = 0;
        arr = new int[5];
        
        System.out.println("Enter elements: ");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = in.nextInt();
        }
        
        for(int i=0 ; i<arr.length ; i++){
            sum = sum + arr[i];
        }
        System.out.print("Sum = " + sum);    
    }
    
}
