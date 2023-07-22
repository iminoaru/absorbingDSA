class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(nums[i])) map.put(nums[i] , map.get(nums[i]) + 1); // if map already contains that element so increase the count.
            else map.put(nums[i] , 1); // else add that element to the map.
        }

        for(int key : map.keySet()){ // make a set of keys and iterate over it.
            if(map.get(key) > nums.length/3) ans.add(key); // If value > length/3 add it to list 'ans'.
        }

        return ans;
    }
}
