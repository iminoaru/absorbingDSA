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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            head = null;
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;
        //System.gc(); drastically increases the space complexity but reduces the time complexity by 4x

        return head;

        
        // if(head.next == null) return null;
        
        // ListNode main = head;

        // ListNode temp = head;
        // int len = 0;

        // while(temp.next != null){
        //     len++;
        //     temp = temp.next;
        // }
        // if(len%2==0){
        //     for(int i = 1 ; i < len/2 ; i++){
        //         main = main.next;
        //     }
        // }    

        // else{
        //     for(int i = 0 ; i < len/2 ; i++){
        //         main = main.next;
        //     }
        // }

        // main.next = main.next.next;

        // return head;

        

    }
}
