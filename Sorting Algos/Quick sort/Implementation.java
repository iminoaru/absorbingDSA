// using the 2 pointers approach for quickSort, it is a divide and conquer algorithm.

import java.util.Arrays;

public class Main{
    
    static int findPartitionIndex(int[] arr , int left , int right){
        int pivotElement = arr[left];  //Taking the first element of unsorted 'arr' as pivot point initially
        int i = left;
        int j = right;
        
        while(i < j){
            
            // these bounds of i and j are important so that the 2 pointers won't go out of the bound of array.
            while(arr[i] <= pivotElement && (i < right))    i++ ; // In arr[i] we used <= and on arr[j] we only used > because if there were duplicate elements with same values as pivot
            while(arr[j] > pivotElement && (j > left ))     j-- ; // then it would be stored on the left part of array only, it can be placed at right side also by using < and >=
        
            if(i < j){ // swap(arr[i] , arr[j])
                arr[i] = arr[i] + arr[j]; // Basic swapping of arr[i] and arr[j] without using temo variable
                arr[j] = arr[i] - arr[j];
                arr[i] = arr[i] - arr[j];
            }
            
        }
        
        // swap(arr[low] , arr[j])
        arr[left] = arr[left] + arr[j]; // Basic swapping of arr[low] and arr[j] without using temo variable
        arr[j] = arr[left] - arr[j];    // This is done because at the end of while loop, the pivot will be at the start so to place it 
        arr[left] = arr[left] - arr[j]; // at its correct position of the sorted array we swap it with the element present at the 'j' index.
            
        return j; // this is the partitionIndex
    }
    
    
    static void quickSort(int[] arr , int left , int right){
        if(left >= right) return;
        
        int partitionIndex = findPartitionIndex(arr, left , right);
        quickSort(arr , left , partitionIndex - 1); // same breakdown pattern as mergeSort's 'divide'
        quickSort(arr , partitionIndex + 1 , right);
        
    }
    
	public static void main(String[] args){
	    int[] arr = {7 , 3  , 7 , 4 , 5 , 1 , 4 , 3 , 2};
      System.out.println(Arrays.toString(arr));
        
	    quickSort(arr , 0 , arr.length - 1);
      System.out.println(Arrays.toString(arr));
	}
}

