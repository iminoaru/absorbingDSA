// Time O(2^n)      |       Space O(n)

import java.util.ArrayList;

class Main{
    static void findingSubsequence(int index , int[] arr , ArrayList<Integer> list){
        int len = arr.length;

        if(index == len){
            System.out.println(list);
            return;
        }

        // Pick
        list.add(arr[index]);
        findingSubsequence(index + 1 , arr , list);
        list.remove(list.size() - 1); // Backtrack to remove the recently inserted element.
        
        // Not pick
        findingSubsequence(index + 1 , arr , list);
        
    }
    
    public static void main(String[] args){
        int[] arr = {3 , 5 , 2 , 1};
        ArrayList<Integer> list = new ArrayList<Integer>();

        findingSubsequence(0 , arr , list);
        
    }
}
