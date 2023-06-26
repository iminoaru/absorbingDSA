https://leetcode.com/problems/sort-list/submissions/979908884/


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
    public ListNode sortList(ListNode head) {

    // Perfect solution but gives TLE for 25/30 case so we have to use merge sort    
       
        // ListNode counter = head;
        // ListNode temp = head;
        // int len = 0;
        // while(counter != null){
        //     len++;
        //     counter = counter.next;
        // }

        // for(int i = 0 ; i < len ; i++){
        //     for(int j = 0 ; j < len - i -1 ; j++){
        //         if(temp.val > temp.next.val){
        //             int t = temp.val;
        //             temp.val = temp.next.val;
        //             temp.next.val = t;  
        //         }
        //         temp = temp.next;
        //     }
        //     temp = head; // resets the pointer to the very start of LL after every complete iteration of the inner for loop/
        // }
        // return head;



        //currently this code is not written by me and it will be updated after learning merge sort
        int length = getLength(head);

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        for (int step = 1; step < length; step *= 2) {
            ListNode prev = dummy;
            ListNode curr = dummy.next;

            while (curr != null) {
                ListNode left = curr;
                ListNode right = split(left, step);
                curr = split(right, step);

                prev = merge(left, right, prev);
            }
        }

        return dummy.next;
    }

    private int getLength(ListNode head) {
        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            length++;
            curr = curr.next;
        }
        return length;
    }

    private ListNode split(ListNode head, int step) {
        if (head == null) {
            return null;
        }

        ListNode prev = null;
        ListNode curr = head;
        for (int i = 0; i < step && curr != null; i++) {
            prev = curr;
            curr = curr.next;
        }

        if (prev != null) {
            prev.next = null;
        }

        return curr;
    }

    private ListNode merge(ListNode left, ListNode right, ListNode prev) {
        ListNode curr = prev;

        while (left != null && right != null) {
            if (left.val <= right.val) {
                curr.next = left;
                left = left.next;
            } else {
                curr.next = right;
                right = right.next;
            }
            curr = curr.next;
        }

        if (left != null) {
            curr.next = left;
        }
        if (right != null) {
            curr.next = right;
        }

        while (curr.next != null) {
            curr = curr.next;
        }

        return curr;
    }
}
