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

// I can't understand DFS like i did BFS as of now, I hope more questions bring clarity.

class Solution {

    int ans = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        findHeight(root);
        return ans - 1;
    }

    public int findHeight(TreeNode node){
        if(node == null) return 0;

        int leftHeight = findHeight(node.left); // 1
        int rightHeight = findHeight(node.right); // 2

        int d = leftHeight + rightHeight + 1;
        ans = Math.max(ans , d);

        return Math.max(leftHeight , rightHeight) + 1; // 3

    }
    //calculate heights of left and right subtree at each node, return the max height from left/right then add those max subtree heights. then add 1 for final answer.
    // 'leftHeight', ie '1' stores '3' and '2' stores '3' after '1' is completed

}
