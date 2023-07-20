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
    public int helper(TreeNode root , int[] sum) {
        if(root == null) return 0;

        int Lsum = Math.max(0 , helper(root.left , sum));
        int Rsum = Math.max(0 , helper(root.right , sum));

        sum[0] = Math.max(sum[0] , (root.val + Lsum + Rsum)); // backtrack to find the max sum.
        return Math.max(Lsum , Rsum) + root.val; // decides weather to pick the right subtree or left subtree through 'Math.max(Lsum , Rsum)'

    }

    public int maxPathSum(TreeNode root) {
        
        int[] sum = new int[1]; // for pass by reference.
        sum[0] = -2147483648; // cant be 0 because if there is only one node and it is negative so the max sum will be < 0.
        helper(root , sum);
        return sum[0];
    }
}
