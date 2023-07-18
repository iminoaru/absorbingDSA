
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

 //PreOrder traversal = left -> Root -> right

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
      
        List<Integer> traversalPath = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if(root == null) return traversalPath;

        TreeNode node = root;
        while(true){
            if(node != null){
                stack.push(node);
                node = node.left;
            }
            else{
                if(stack.isEmpty()) break; // exit condition of loop/
                
                node = stack.pop();
                traversalPath.add(node.val);
                node = node.right;
            }
        }

     return traversalPath;

    }
}    
