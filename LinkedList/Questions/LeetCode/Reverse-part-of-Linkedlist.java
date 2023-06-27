https://leetcode.com/problems/reverse-linked-list-ii/submissions/980636121/

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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(left == right) return head;

        ListNode back = null;
        ListNode current = head;
        
        // reaching left - 1 th node
        for(int i = 0 ; current != null && i < left-1 ; i++){
            back = current;
            current = current.next;
        }

        ListNode last = back;
        ListNode newEnd = current;
        ListNode front = current.next; // should be kept here only not above.

        // reversing from left to right
        for(int i = 0 ; current != null && i < right-left+1; i++){
            current.next = back;
            back = current;
            current = front;
            if(front != null) front = front.next;
        }

        //joining the left side to the reversed part of list.
        if(last != null) last.next = back;
        else head = back;

        // joining the reversed part to the right side remaining list.
        newEnd.next = current;

        return head;
    }
}
