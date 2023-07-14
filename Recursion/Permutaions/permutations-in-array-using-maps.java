https://leetcode.com/problems/permutations/submissions/994294776/

// Time -> O(n! * n)   |   Space -> O(n) + O(n) [one O(n) is from the isDuplicates array]

class Solution {

    static void findPermutation(int[] nums , ArrayList<Integer> temp , boolean[] isDuplicate , List<List<Integer>> ans){
        if(nums.length == temp.size()){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i = 0 ; i < nums.length ; i++){
            if(isDuplicate[i] == false){ // checks if the element is already inside 'temp' or not.
                
                temp.add(nums[i]); 
                isDuplicate[i] = true; // marks that the element is added to 'temp'
                findPermutation(nums , temp , isDuplicate , ans);
                temp.remove(temp.size() - 1); // Backtrack to the previous step
                isDuplicate[i] = false; // marks that the element is removed from 'temp'
            }
        }
        // no NOT PICK call because a permutation literally requires all the elements in an array, just in different order.
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        boolean[] isDuplicate = new boolean[nums.length]; // Acts like a map 
        findPermutation(nums , temp , isDuplicate , ans);
        return ans;
    }
}
