// https://leetcode.com/problems/linked-list-cycle-ii/submissions/979875256/

// length of linked list is found by starting a counter when the fast and slow 
// pointer meet and the counter increases until the slow pointer reaches that 
// fast pointer again.
// to find the start, we will keep 2 pointers, both at the start of LL.
// then we will iterate one of the ptr(insideCyclePtr) for the length of cycle
// times while the other(firstPtr) stays at the start of LL.
// it works because the total length of LL - length of cycle = cycle starting point.
// then the loop will run until the 2 pointers meet (insideCyclePtr & firstPtr)
// finally return any of the 2 pointers because they are at the start of LL cycle.


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
    public ListNode detectCycle(ListNode head) {
        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;

            int len = 0;
            
                    if(fastPtr == slowPtr){
                        ListNode temp = slowPtr;
                        do{                         // finding length of cycle
                            len++;
                            temp = temp.next;
                        }
                        while(temp != fastPtr);
                    
            ListNode firstPtr = head;
            ListNode insideCyclePtr = head;    

            while(len > 0){                       // moving the insideCyclePtr 'length of cycle' times.          
                insideCyclePtr = insideCyclePtr.next;
                len--;
            } 

            while(firstPtr != insideCyclePtr){
                firstPtr = firstPtr.next;
                insideCyclePtr = insideCyclePtr.next;
            }
            return firstPtr;
            }
        }
        return null;
    }
}
