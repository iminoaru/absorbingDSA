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

 //InOrder traversal = left -> Root -> right

class Solution {
    List<Integer> traversalPath = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {

        if(root == null) return traversalPath; // storing the path in a dataStructure(here ArrayList)

        inorderTraversal(root.left);   // Left
        traversalPath.add(root.val);    // Root
        inorderTraversal(root.right);  // Right
        
        return traversalPath;
    }
}
