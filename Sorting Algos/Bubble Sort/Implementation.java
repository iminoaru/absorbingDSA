import java.util.Arrays;

public class Main{
    static void bubbleSort(int arr[], int n){
        
        for(int i = 0 ; i < n - 1 ; i++){
            for(int j = 0 ; j < n - i - 1 ; j++){
                
                if (arr[j] > arr[j + 1]){ // swap(arr[j] , arr[j + 1])
                    
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
    }    
  
	public static void main(String[] args) {
	  int arr[] = {64 , 54 , 34 , 25 , 12 , 78 , 22 , 11 , 90 , 69};
          System.out.println(Arrays.toString(arr));
        
  	  bubbleSort(arr, arr.length - 1);
          System.out.println(Arrays.toString(arr));
	}
}

