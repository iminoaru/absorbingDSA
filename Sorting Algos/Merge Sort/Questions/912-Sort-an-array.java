https://leetcode.com/problems/sort-an-array/submissions/991839443/

class Solution {
    static void merge(int[] nums , int left , int mid , int right){
        ArrayList<Integer> tempArr = new ArrayList<Integer>();
        int low = left;
        int high = mid + 1;

        while(low <= mid && high <= right){
            if(nums[low] <= nums[high]){
                tempArr.add(nums[low]);
                low++;
            }
            
            else{
                tempArr.add(nums[high]);
                high++;
            }
        }

        while(low <= mid){
            tempArr.add(nums[low]);
            low++;
        }

        while(high <= right){
            tempArr.add(nums[high]);
            high++;
        }

        for(int i = left ; i <= right ; i++){
            nums[i] = tempArr.get(i - left);
        }

    }

    static void divide(int[] nums , int left , int right){
        if(left == right) return;

        int mid = left + (right - left)/2;

        divide(nums , left , mid);
        divide(nums , mid + 1 , right);
        merge(nums , left , mid , right);
    }

    public int[] sortArray(int[] nums) {
        divide(nums , 0 , nums.length - 1);
        return nums;
    }
}
