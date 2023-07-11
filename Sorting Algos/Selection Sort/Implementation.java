import java.util.Arrays;

public class Main{
    
    static void selectionSort(int[] arr){
        int len = arr.length;
        
        for(int i = 0 ; i < len - 1 ; i++){
            // Find the 'min' element in unsorted array.
            int min = i;
            for(int j = i ; j < len ; j++){
                if(arr[min] > arr[j]) min = j;
            }
            // Swap the found minimum element with the first element.
            // arr[min] = arr[min] + arr[i];  IDK WHY THIS AIN'T WORKING HERE
            // arr[i] = arr[min] - arr[i];
            // arr[min] = arr[min] - arr[i];
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        
    }
    
	public static void main(String[] args){
	    int[] arr = {97 , 50 , 73 , 67 , 67 , 71 , 76 , 65 , 23 , 12};
	    System.out.println(Arrays.toString(arr));
	    
	    selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}

