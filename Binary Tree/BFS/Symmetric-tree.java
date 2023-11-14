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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root.left);
        q.offer(root.right);

        while(q.isEmpty() == false){
            TreeNode l = q.poll();
            TreeNode r = q.poll();

            if(r == null && l == null) continue;

            if(r == null || l == null) return false;

            if(r.val != l.val) return false;

            q.offer(l.left);
            q.offer(r.right);
            q.offer(l.right);
            q.offer(r.left);

        }
        return true;
    }
}
