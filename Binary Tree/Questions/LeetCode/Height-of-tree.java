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

 // Time -> O(n)   |    Space -> O(n)


class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        int rightHeight = maxDepth(root.right);
        int leftHeight = maxDepth(root.left);

        int height = 1 + Math.max(rightHeight , leftHeight); // +1 because the root level is considered 0.
        return height;
    }
}
