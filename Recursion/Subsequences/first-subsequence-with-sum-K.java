// Time O(2^n)      |       Space O(n)
// One of recursion techniques, also used in DP.

import java.util.ArrayList;

class Main{
    static boolean findingSubsequence(int index , int[] arr , ArrayList<Integer> list , int target , int sum){
        int len = arr.length;
        
        if(index == len){
            if(sum == target){
                System.out.println(list);
                return true;
            }
            return false;
        }

        // PICK
        list.add(arr[index]); 
        sum = sum + arr[index]; // added the element at that index to the 'sum'
        
        if(findingSubsequence(index+1 , arr , list , target , sum)) return true; // No need to go forward now as we got one subsequence.
        
        sum = sum - arr[index]; // removes the lastly added element from 'sum' (element at the last of 'list')
        list.remove(list.size() - 1); 

      
        // NOT PICK
        if(findingSubsequence(index+1 , arr , list , target , sum)) return true; // No need to go forward now as we got one subsequence.     
        
        return false; // There was no subsequence present in the array with sum = k.
    }
    
    public static void main(String[] args){
        int[] arr = {3 , 5 , 1 , 6 , 4};
        int target = 6;
        ArrayList<Integer> list = new ArrayList<Integer>(); 

        findingSubsequence(0 , arr , list , target , 0);
        
    }
}
