https://leetcode.com/problems/remove-duplicates-from-sorted-list/submissions/979884847/


// compare every other adjecent nodes, if they are equal then point the first node
// to the third node, repeat till null.

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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode finalLL = head;
        
        if(finalLL == null) return finalLL;

        while(head.next != null){
            if(head.val == head.next.val) head.next = head.next.next;
            else head = head.next;   
        }
        return finalLL;
    }
}
