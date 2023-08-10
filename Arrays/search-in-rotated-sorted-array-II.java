// Binary search doesn't look fruitful to me rn as my current approach is to 
// find the index at which it pivots which will take O(n) through iteration,
// then mark it as start. So currently this solution looks a good fit for this criteria.
// Also beats 100%

class Solution {
    public boolean search(int[] nums, int target) {
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == target) return true;
        }
        return false;  
    }
}
