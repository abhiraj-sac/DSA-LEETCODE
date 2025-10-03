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
        // brute
        // ListNode temp = head;
        // ListNode dummy = temp;
        // int c=0;
        // if(head.next == null){
        //     return null;
        // }
        // if(head.next.next == null){
        //     head.next = null;
        //     return head;
        // }
        // while(dummy != null){
        //     dummy = dummy.next;
        //     c++;
        // }
        // int f = (int) Math.floor(c / 2.0);
        // for(int i=0;i<f-1;i++){
        //     temp= temp.next;
        // }
        // temp.next = temp.next.next;
        // return head;
        ListNode slow = head;
        ListNode fast = head;
        if(head.next == null){
            return null;
        }
        if(head.next.next == null){
            head.next = null;
            return head;
        }
        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.val = slow.next.val;
        slow.next = slow.next.next;
        return head;

    }
}