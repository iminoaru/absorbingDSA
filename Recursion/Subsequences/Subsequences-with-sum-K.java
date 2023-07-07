// Time O(2^n)      |       Space O(n)

import java.util.ArrayList;

class Main{
    static void findingSubsequence(int index , int[] arr , ArrayList<Integer> list , int target , int sum){
        int len = arr.length;
        
        if(index == len){
            if(sum == target){
                System.out.println(list);
            }
            return; 
        }

        // PICK
        list.add(arr[index]); 
        sum = sum + arr[index]; // added the element at that index to the 'sum'
        
        findingSubsequence(index+1 , arr , list , target , sum); // basically it iterates
        
        sum = sum - arr[index]; // removes the lastly added element from 'sum' (element at the last of 'list')
        list.remove(list.size() - 1); 

      
        // NOT PICK
        findingSubsequence(index+1 , arr , list , target , sum);     
    }
    
    public static void main(String[] args){
        int[] arr = {3 , 5 , 1 , 3 , 6 , 4 , 2 , 7};
        int target = 6;
        ArrayList<Integer> list = new ArrayList<Integer>(); 

        findingSubsequence(0 , arr , list , target , 0);
        
    }
}
