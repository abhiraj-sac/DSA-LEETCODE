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
    public ListNode oddEvenList(ListNode head) {
        ListNode curr=head;int c=1;
        ListNode d1 = new ListNode(0);
        ListNode d2  =new ListNode(0);
        ListNode even =d2;
        ListNode odd=d1;

        while(curr != null){
            if(c % 2 == 0){
                even.next = new ListNode(curr.val);
                even =even.next;
            }
            else if(c % 2 != 0){
               odd.next = new ListNode(curr.val);
                odd =odd.next; 
            }
            curr = curr.next;
            c++;
        }
        odd.next = d2.next;
        return d1.next;
    }
}