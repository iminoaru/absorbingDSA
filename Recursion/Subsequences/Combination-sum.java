https://leetcode.com/problems/combination-sum/submissions/993420374/

// Preety much same logic as the 'find subsequences with sum k' but the only change
// is that same elements can be picked multiple times and we actually have to store
// all those subsequences rather than just printing them.


class Solution {

    static void recursiveFn(int index , int target , int[] candidates , List<List<Integer>> ans , ArrayList<Integer> temp){

        if(index == candidates.length){ // marks the end of array as no more elements left.
            if(target == 0){ // store the 'temp' in 'ans'
                ans.add(new ArrayList<>(temp)); // logic at end of page.
                }
        return;
            }

        // PICK
        if(candidates[index] <= target){ // if the element at that index is already more than the target than no picking is needed and we can skip to Not Pick.
            temp.add(candidates[index]);
            recursiveFn(index , target - candidates[index] , candidates , ans , temp);
            temp.remove(temp.size() - 1); // Backtracks to the previous recursive call therefore removes the lastly added element.
        }

        // NOT PICK
        recursiveFn(index + 1 , target , candidates , ans , temp);

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>(); // stores the actual list of arrays that is asked in question.
        ArrayList<Integer> temp = new ArrayList<>(); // stores each array of that list like a container, added it to the 'ans' then empties 
        // itself(not literally empty by like a method but as it reaches to the top of recursive tree, it gets empty)
        recursiveFn(0 , target , candidates , ans , temp);
        return ans;
    }
}


//  the line ans.add(new ArrayList<>(temp)); creates a new ArrayList object by 
// using the constructor call new ArrayList<>(temp). This creates a separate copy of 
// the elements in the temp ArrayList to avoid modifying it in subsequent iterations 
// of the recursive function. By adding this new ArrayList to the ans list, each 
// combination added is independent and unaffected by further changes to temp. This 
// approach ensures correct results and prevents errors related to modifying shared 
// ArrayList references.
