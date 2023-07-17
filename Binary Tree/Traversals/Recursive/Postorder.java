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


//PostOrder traversal = left -> right -> Root

class Solution {
    List<Integer> traversalPath = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {

        if(root == null) return traversalPath; // storing the path in a dataStructure(here ArrayList)

        postorderTraversal(root.left);   // Left
        postorderTraversal(root.right);  // Right
        traversalPath.add(root.val);    // Root
        
        return traversalPath;
    }
}
