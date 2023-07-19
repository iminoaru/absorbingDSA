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

// Time -> O(n)  |    Space -> O(n)

// = -1   -> not balanced
// != -1  -> balanced

class Solution {
    public int helper(TreeNode root) {
        if(root == null) return 0; 

        int rightHeight = helper(root.right);
        if(rightHeight == -1) return -1; // statement at line 31 returns -1 from either left or right and if it is -1 then this condition terminates.
        int leftHeight = helper(root.left);
        if(leftHeight == -1) return -1; 

        if (Math.abs(rightHeight-leftHeight) > 1) return -1; // if at any point the difference between leftH and rightH is more than 1, it becomes unbalanced so just return -1.
        return Math.max(rightHeight , leftHeight) + 1; // returning the height of BT (signifies that the tree is balanced)
    }

    public boolean isBalanced(TreeNode root) {
        return helper(root) != -1;
    }
}
