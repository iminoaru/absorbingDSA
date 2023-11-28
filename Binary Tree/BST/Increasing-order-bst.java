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

    TreeNode r = new TreeNode();
    TreeNode ans = r;

    public TreeNode increasingBST(TreeNode root) {
        TreeNode r = new TreeNode(root.val);
        dfs(root);
        return ans.right;
    }

    public void dfs(TreeNode root){
        if(root == null) return;
        dfs(root.left);
        r.right = new TreeNode(root.val);
        r = r.right;
        dfs(root.right);

    }

}
