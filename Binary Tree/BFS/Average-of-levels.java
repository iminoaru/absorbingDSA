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
    public List<Double> averageOfLevels(TreeNode root) {
        
        List<Double> ans = new ArrayList<>();
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(q.isEmpty() == false){
            int levelSize = q.size();
            double sum = 0.00;

            for(int i = 0 ; i < levelSize ; i++){
                TreeNode curr = q.poll();

                sum += curr.val;

                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
            }
            ans.add(sum/levelSize);
        }
        return ans;
    }
}
