https://leetcode.com/problems/linked-list-cycle/submissions/979882602/


// solved using Floyd cycle detection Algorithm

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */


public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;

            if(fastPtr == slowPtr) return true;
            
                //To find the length of the cycle:
                    // if(fastPtr == slowPtr){
                    //     ListNode temp = slowPtr;
                    //     int len = 0;
                    //     do{
                    //         temp = temp.next;
                    //         len++;
                    //     }
                    //     while(temp != fastPtr);
                    //     return len;
                    // }
        }
        return false;
    }
}
