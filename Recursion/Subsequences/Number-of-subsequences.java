// Time O(2^n)      |       Space O(n)

// The general formula to find number of subsequences is just 2^length of array.
// This is a pattern that can also be used if some conditions are given like sum = k etc.

// This left right technique is widely used in DP.

import java.util.ArrayList;

class Main{
    static int findingSubsequence(int index , int[] arr){
        int len = arr.length;
        int left = 0 , right = 0;
        
        if(index == len) return 1; 

        // PICK
        left = findingSubsequence(index + 1 , arr);
        
        // NOT PICK
        right = findingSubsequence(index + 1 , arr); 
        
        return left + right;
    }
    
    public static void main(String[] args){
        int[] arr = {3 , 2 , 5 , 3 , 6};
       
        int totalSubsequences = findingSubsequence(0 , arr);
        System.out.println(totalSubsequences);
        
    }
}
