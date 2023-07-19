// Time -> O(n)  |    Space -> O(n)

// Find the height at every node and return the maximum height.

class Solution {
    public int helper(TreeNode root , int[] diameter){
        if(root == null) return 0;

        int leftHeight = helper(root.left , diameter); //  combining the traversal and
        int rightHeight = helper(root.right , diameter);// the height finder in one function call.
      
        diameter[0] = Math.max(diameter[0] , (leftHeight + rightHeight)); // compares the current height with previous heights.
        return Math.max(leftHeight , rightHeight) + 1; // part of height finder.

    }
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1]; // array passes by reference thats why we used array(juggad)
        helper(root , diameter);
        return diameter[0];
    }
}
