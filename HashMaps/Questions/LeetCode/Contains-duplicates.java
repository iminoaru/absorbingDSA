class Solution {
  
    public boolean hashmap(int[] nums){
        HashMap<Integer , Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(nums[i])) return true;
            else map.put(nums[i] , 1);
        }

        return false;
    }

    public boolean hashset(int[] nums){
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0 ; i < nums.length ; i++){
            if(set.contains(nums[i])) return true;
            else set.add(nums[i]);
        }

        return false;   
    }

    public boolean containsDuplicate(int[] nums) {
        return hashset(nums);
    }
}
