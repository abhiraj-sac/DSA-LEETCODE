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
    public ListNode reverseList(ListNode head) {
        ListNode one = head;
        ListNode two = head;int c=0;
       
        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;
        while(one != null){
            one = one.next;
            c++;
        }
        int[] arr = new int[c];int i=0;
        while(two != null){
            arr[i++] = two.val;
            two =two.next;
        }
        for(int j=arr.length-1;j>=0;j--){
                ans.next = new ListNode(arr[j]);
                ans=ans.next;
        }
        return dummy.next;
    }
}