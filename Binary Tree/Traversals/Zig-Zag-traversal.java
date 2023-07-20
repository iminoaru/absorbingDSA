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

// ditto same as BFS traversal but here we keep a flag that when its true, we add the queue's 'subList' as 
// it is and when flag is false, we add the queue in reverse order to the sublist.

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> traversalPath = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>(); // I usually forget that the queue is of type 'TreeNode'

        if(root == null) return traversalPath;
        queue.offer(root);
        boolean flag = true;

        while(!queue.isEmpty()){
            int len = queue.size();
            List<Integer> subList = new ArrayList<>();

            for(int i = 0 ; i < len ; i++){
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);

                if(flag) subList.add(queue.poll().val);
                else subList.add(0 , queue.poll().val); // add in reverse.
            }

            flag = !flag; // chanhong the flag.
            traversalPath.add(subList);
        }

        return traversalPath;
    }
}
