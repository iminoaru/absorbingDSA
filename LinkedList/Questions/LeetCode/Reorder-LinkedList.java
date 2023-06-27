https://leetcode.com/problems/reorder-list/submissions/980852543/

// Reverse the second part and join each nth node(starting from head) to the
// nth node(starting from secondHead).
// like if the LL is of 8 nodes then 1st node with 5th(considered 1st node of secondHead)
// and so on.


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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;

         // finding middle element(slowMidFinder)
        ListNode fastMidFinder = head;
        ListNode slowMidFinder = head;

        while(fastMidFinder != null && fastMidFinder.next != null){
            fastMidFinder = fastMidFinder.next.next;
            slowMidFinder = slowMidFinder.next;
        }

        ListNode secondHead = slowMidFinder;

        // reversing the second half of the LinkedList
        ListNode back = null;
        ListNode current = slowMidFinder;
        ListNode front = current.next;

        while(current != null){
            current.next = back;
            back = current;
            current = front;
            if(front != null) front = front.next;

        }
        secondHead = back;

        // joins the nodes in desired order
        while(head != null && secondHead != null){
          
            ListNode originalHeads = head.next;
            head.next = secondHead; // joins the first part's node to second part's node.
            head = originalHeads; // iterates to next node of the given(original) LL 

            originalHeads = secondHead.next;
            secondHead.next = head; // joins the second part's node to first part's node.
            secondHead = originalHeads; // iterates to next node of the given(original) LL 
        }
      
        // completes the linked list by making the tail to point at null.
        if(head != null) head.next = null;
    }
}
