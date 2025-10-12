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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null && n==1){return null;}
        int l=0;
        ListNode curr = head;
        ListNode c=head;
        while(curr != null){
            curr = curr.next;
            l++;
        }
        if (n == l) {
            return head.next;
        }
        int f = (l-n)-1;
        while(f != 0){
        c= c.next;
        f--;            
        }
        c.next=c.next.next;
        return head;
    }
}