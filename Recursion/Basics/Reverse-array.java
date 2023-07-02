import java.util.Arrays;

public class Main{
    
    static void reverse(int i , int size , int[] arr){
        if(i >= size/2) return;
        
        int temp = arr[i];
        arr[i] = arr[size - i - 1];
        arr[size - i - 1] = temp;
        
        reverse(i+1 , size , arr);
    }
    
	public static void main(String[] args){
	    int size = 7;
	    
	    int[] arr = {1 , 2 , 3 , 4 , 5 , 6 , 7};
	    System.out.println(Arrays.toString(arr));
	    
	    reverse(0 , size , arr);
	    System.out.println(Arrays.toString(arr));
	    
	}
}
