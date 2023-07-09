import java.util.ArrayList; // for the use of 'temp' ArrayList
import java.util.Arrays; // for Arrays.toString()

public class Main{
    
    static void merge(int[] arr , int left , int mid , int right){
        ArrayList<Integer> temp = new ArrayList<>(); // temperory array to store the elements of 'arr' while sorting
        
        // Iterators used for sorting
        int leftIndex = left; 
        int rightIndex = mid + 1; // the start of right side if after the end of left halfd so mid +1
        
        while(leftIndex <= mid && rightIndex <= right){
            if(arr[leftIndex] <= arr[rightIndex]){
                temp.add(arr[leftIndex]);
                leftIndex++;
            } 
            else{
                temp.add(arr[rightIndex]);
                rightIndex++;
            }
        }

        while(leftIndex <= mid){ // Add remaining elements of the left half of the array to the arraylist 'temp'
            temp.add(arr[leftIndex]);
            leftIndex++;
        }

        while(rightIndex <= right){ // Add remaining elements of the right half of the array to the arraylist 'temp'
            temp.add(arr[rightIndex]);
            rightIndex++;
        }
        
        // Copy all the elements of Arraylist 'temp' to our array 'arr' (it overwrites the original array)
        for (int i = left ; i <= right ; i++) {arr[i] = temp.get(i - left);}
        
    }
        
    
    static void divide(int[] arr , int left , int right){
        if(left == right)  return;
        
        int mid = left + (right - left)/2;

        // first the whole left side is divided and then after completion the right side is divided just as the recursion tree
        divide(arr , left , mid); // keeps dividing the left side of the 'arr' until it reaches the size of 1 (ie. left == right , ie. only one element left)
        divide(arr , mid + 1 , right); // keeps dividing the right side of the 'arr' until it reaches the size of 1 (ie. left == right , ie. only one element left)
        
        merge(arr , left , mid , right);
        
    }
    
	public static void main(String[] args){
	    
	    int[] arr = {9 , 4 , 7 , 6 , 3 , 8 , 2 , 1 , 5};
	    int size = arr.length - 1;
	    System.out.println(Arrays.toString(arr)); // Before Sort
	    
	    divide(arr , 0 , size);
		  System.out.println(Arrays.toString(arr)); // After Sort
	}
}

