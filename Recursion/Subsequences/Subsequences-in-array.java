// Time O(2^n)      |       Space O(n)

// list does not contain all the subsequences as an 'ArrayList of arrays' rather it is just used to print every other subsequence like [1] , [1,3] not {[1] , [1,3]}
// the fn finally exits when all the different subsequence calls reaches the len even though the list at that time might contain only one element, like when all the fn calls are over.

import java.util.ArrayList;

class Main{
    static void findingSubsequence(int index , int[] arr , ArrayList<Integer> list){
        int len = arr.length;

        if(index == len){
            System.out.println(list);
            return; // it dont exit the whole fn, it just exits that function call and jumps to next fn call(if any)
        }

        // Pick
        list.add(arr[index]); // adds the picked element to the 'list' to print it.
        findingSubsequence(index + 1 , arr , list); // iterating (kindof)
        list.remove(list.size() - 1); // Backtrack to remove the recently inserted element. ex removes 3 from [1,3]
        
        // Not pick
        findingSubsequence(index + 1 , arr , list); // basically skips that element and the fn call goes back to the 'Pick'
        
    }
    
    public static void main(String[] args){
        int[] arr = {3 , 5 , 2 , 1};
        ArrayList<Integer> list = new ArrayList<Integer>(); // A variable array named 'list' made to print the subsequences one by one.
        // it does not store all those subsequences in it rather works as a container to hold on to that array of subsequences (basically that subsequence) 
        // until its printed and then the last element is removed to kindof backtrack to the previous state.

        findingSubsequence(0 , arr , list);
        
    }
}
