https://leetcode.com/problems/rotate-list/submissions/981345587/

// Reverse the List from kth node to null and just put all the reversed elements before head one by one.
// Time -> O(n)  |  Space -> O(1)

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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head; // edge cases
        
        ListNode sizeFinder = head;
        int size = 0;

        while(sizeFinder != null){
            size++;
            sizeFinder = sizeFinder.next;
        }

        k = k % size; // key logic so that if k exceeds the size, we dont rotate again and again we just remove the repeated steps.

        ListNode newTail = head;
        for(int i = 0 ; i < size - k -1 ; i++){
            newTail = newTail.next;
        }

        ListNode kHead = newTail.next; // first node of the reversed part of LL

         // reversing the last k nodes of the LinkedList
        ListNode back = null;
        ListNode current = kHead;

        while(current != null){
            ListNode front = current.next; // if this was declared outside while loop then it gave nullPointerException.
            current.next = back;
            back = current;
            current = front;
            if(front != null) front = front.next;

        }
        kHead = back;

        // main logic to rotate the list
        while(head != null && kHead != null){
            ListNode originalkHead = kHead.next; //
            kHead.next = head;
            head = kHead;
            kHead = originalkHead;
        }

        // setting the k - 1 th node.next = null to end the LL
        newTail.next = null;
    
        return head;

    }
}
