

https://leetcode.com/problems/binary-tree-preorder-traversal/submissions/996695383/

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


//PreOrder traversal = Root -> left -> right

class Solution {
    List<Integer> traversalPath = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {

        if(root == null) return traversalPath; // storing the path in a dataStructure(here ArrayList)

        traversalPath.add(root.val);    // Root
        preorderTraversal(root.left);   // Left
        preorderTraversal(root.right);  // Right
        
        return traversalPath;
    }
}
