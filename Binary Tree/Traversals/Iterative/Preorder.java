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
    public List<Integer> preorderTraversal(TreeNode root) {
      
      List<Integer> traversalPath = new ArrayList<>();
      Stack<TreeNode> stack = new Stack<>();

      if(root == null) return traversalPath;

      stack.push(root);

      while(!stack.isEmpty()){

        root = stack.pop();
        traversalPath.add(root.val);

        // right must be before left because the stack is a LIFO so if left is added later then it will come out first which is our goal.
        if(root.right != null) stack.push(root.right);
        if(root.left != null) stack.push(root.left);
      }
    return traversalPath;
    }
}

