/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode,Integer> map = new HashMap<>();
        ListNode c1= headA;
        ListNode c2 = headB;
        while(c1 != null){
            map.put(c1,1);
            c1=c1.next;
        }
        while(c2 != null){
            if(map.containsKey(c2)){
                return c2;
            }
            c2=c2.next;
        }
        return null;
    }
}