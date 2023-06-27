https://leetcode.com/problems/palindrome-linked-list/submissions/980830800/


// just reverse the second half of the linked list and compare the first half with
// that second half we reversed.

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
    public boolean isPalindrome(ListNode head) {
        
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

        // comparing the 2 halves
        while(secondHead != null){
            if(head.val != secondHead.val) return false;
            
            head = head.next;
            secondHead = secondHead.next;
        }
        return true;
    }
}
