https://leetcode.com/problems/middle-of-the-linked-list/submissions/979879979/

// the fastPtr moves twice as fast as the slowPtr so by the time the fastPtr
// reaches the end, the slowPtr will reach just halfway and we will return slowPtr.

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
    public ListNode middleNode(ListNode head) {
        ListNode fastPtr = head;
        ListNode slowPtr = head;

        if(head.next == null) return head;

        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }
}
