https://leetcode.com/problems/delete-node-in-a-linked-list/submissions/998175336/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// Came up to the approach on my own.
// update the value of 'node' to value of 'node.next' until null, then set the end as null.

// [4,5,1,9] Input
// [4,1,9,9] Output without 'prevNode'
// [4,1,9]   output after 'prevNode'

class Solution {
    public void deleteNode(ListNode node) {
        ListNode prevNode = node; // last second element.

        while(node.next != null){
            if(node.next.next == null){
                prevNode = node;
            }
            node.val = node.next.val;
            node = node.next;
        }
        prevNode.next = null;
    }
}
