/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean helper(TreeNode left , TreeNode right){
        if(left == null || right == null){ // comparing structure of left part and right part.
            if(left == right) return true;
            return false;
        }

        if(left.val != right.val) return false; // comparing values.
      
        // left of left side should be equal to right of right side AND right of left side should be equal to left of right side.
        return helper(left.left , right.right) && helper(left.right , right.left); 
    }

    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return helper(root.left , root.right);
    }
}
