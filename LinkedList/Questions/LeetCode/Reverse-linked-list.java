https://leetcode.com/problems/reverse-linked-list/submissions/980042913/


// current.next = back (same as front = back) kind of swaps the node
// rest 3 statements in the while loop are iterators.


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return head; // Edge case

        ListNode back = null;
        ListNode current = head;
        ListNode front = current.next;

        while(current != null){
            current.next = back;

            back = current;
            current = front;
            if(front != null) front = front.next;
        }
        head = back;

        return head;
    }
}
