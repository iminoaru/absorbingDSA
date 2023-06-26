https://leetcode.com/problems/merge-two-sorted-lists/submissions/979883433/


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
    public ListNode mergeTwoLists(ListNode n1, ListNode n2) {
        ListNode finalLL = new ListNode();
        ListNode head = finalLL;
        
        while(n1 != null && n2 != null){

            if(n1.val > n2.val){
                head.next = n2;
                n2 = n2.next;
                head = head.next;

            }
            else {
                head.next = n1;
                n1 = n1.next;
                head = head.next;
            }   
        }
      
        //adds remaining elements to the head after one list reaches null
        // while(n1 != null){
        //     head.next = n1;
        //     n1 = n1.next;
        // }
        // while(n2 != null){
        //     head.next = n2;
        //     n2 = n2.next;
        // }
      
        head.next = (n1 == null) ? n2 : n1; // this statement is making me go insane i cant understand why it is working and the while loop above fails at 89/208
        
        //returning 2nd element because first is null
        return finalLL.next;
    }
}
