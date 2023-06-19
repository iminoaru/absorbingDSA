import java.util.Arrays;
import java.util.Scanner;

public class Arr {
    public static void main(String[] sarthak) {
    Scanner in = new Scanner(System.in);

        int[] arr;          // decleration of arr. 'arr' is getting defined in stack
       
        arr = new int[5];   // Initialization: actual creation of object and
                            // memory allocation in heap.  (called DMA) 
        // int[] arr = new int[8]; direct
        
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = in.nextInt();
        }
       
        // PRINTING Arr
        // convertional
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        // using for-each loop
        for(int num : arr){
            System.out.print(num + " ");
        }
        
        // Predefined for loop that adds , and [] too (Best Method)
        System.out.println(Arrays.toString(arr));
    }
    
}
