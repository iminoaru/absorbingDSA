class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i] , map.get(nums[i]) == null ? 1 : map.get(nums[i])+1);
        }
        int count = 0;
        for(int i : map.keySet()){
            if(map.get(i) < 2){
                return -1;
            }
            if(map.get(i) % 3 == 0){
                count += map.get(i)/3;
            }

            // prevents failing when the map.get == 10 
            // breakdown -> 3 + 3 + 2 + 2 = 4
            // rather thatn 2 + 2 + 2 + 2 + 2 = 5
            else if(map.get(i) % 3 == 2){
                count += map.get(i)/3;
                count++;
            }
            else if(map.get(i) % 3 == 1){
                count += map.get(i)/3;
                count++;
            }
            // 
            else if(map.get(i) % 2 == 0){
                count += map.get(i)/2;
            }
            
        }
        return count;
    }
}
