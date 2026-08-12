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
        int l=0;
        if(head.next == null && n==1){return null;}
        ListNode a=new ListNode(-1);
        ListNode len=head;
        ListNode ans = head;
        // ListNode temp=head;
        while(len != null){
            len=len.next;
            l++;
        }
        if (n == l) {
            return head.next;
        }
        l = l-n;
        l=l-1;
        while(l-- >0){
            ans=ans.next;
        }
        ans.next=ans.next.next;
        return head;
    }
}