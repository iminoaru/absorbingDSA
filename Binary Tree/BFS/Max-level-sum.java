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
    public int maxLevelSum(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null) return 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(q.isEmpty() == false){
            int len = q.size();
            
            ArrayList<Integer> list = new ArrayList<>();

            for(int i = 0 ; i < len ; i++){
                TreeNode curr = q.poll();
                list.add(curr.val);

                if(curr.left != null){
                    q.offer(curr.left);
                }
                if(curr.right != null){
                    q.offer(curr.right);
                }
            }

            int sum = 0;;
            for(int j = 0 ; j < list.size() ; j++){
                sum += list.get(j);
            }
            ans.add(sum);

        }   
        int max = Integer.MIN_VALUE;
        int result = 0;
        for(int i = 0 ; i < ans.size() ; i++){
            if(ans.get(i) > max){ 
            max = ans.get(i);
            result = i+1;
            }
        }   
        return result;
    }
}
