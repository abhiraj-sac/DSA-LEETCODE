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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode l = head;
        while(l != null){
            list.add(l.val);
            l=l.next;
        }
        Collections.sort(list);
        ListNode ans=new ListNode(0);
        ListNode n = ans;
        for(int i:list){
            n.next = new ListNode(i);
            n= n.next;
        }
        return ans.next;
    }
}