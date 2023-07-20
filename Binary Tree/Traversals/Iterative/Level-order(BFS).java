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

 // Time -> O(n)    |    Space -> O(n)

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> traversalPath = new ArrayList<>(); // main list of lists

        if(root == null) return traversalPath;

        queue.offer(root); // adding root to the queue

        while(!queue.isEmpty()){
            int level = queue.size();
            List<Integer> subList = new ArrayList<>();

            for(int i = 0 ; i < level ; i++){
                if(queue.peek().left != null) queue.offer(queue.peek().left); // if left is not null, add it to queue.
                if(queue.peek().right != null) queue.offer(queue.peek().right); // if left is not null, add it to queue.
                subList.add(queue.poll().val); // add the queue to a subList.
            }
            traversalPath.add(subList); // add that subList to the final list of lists 'traversalPath'
        }
        return traversalPath;
    }
}
