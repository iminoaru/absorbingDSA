https://leetcode.com/problems/combination-sum-ii/submissions/993470611/

// Didn't fully got the vibe of this question.

class Solution {

    static void findingSubsequence(int index, int target, int[] candidates, ArrayList<Integer> temp, List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) continue; // Skip duplicates
            if (target < candidates[i]) break;

            temp.add(candidates[i]);
            findingSubsequence(i + 1 , target - candidates[i] , candidates , temp , ans);
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); // Sort the array to handle duplicates

        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        
        findingSubsequence(0, target, candidates, temp, ans);
        return ans;
    }
}
