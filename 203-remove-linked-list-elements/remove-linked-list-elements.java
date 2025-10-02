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
    public ListNode removeElements(ListNode head, int d) {
        ListNode dummy = new ListNode(-1);
         dummy.next =head;
         ListNode t =dummy;
        while(t.next != null){
            if(t.next.val == d){
                t.next= t.next.next;
            }
            else{
                t = t.next;
            }            
        }
        return dummy.next;
    }
}