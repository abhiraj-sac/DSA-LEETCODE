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
        int a=0,b=0;
        ListNode A=headA;ListNode B=headB;
        if(headA == null || headB == null){return headA;}
        while(A!= null){
            A=A.next;a++;
        }
        while(B!=null){
            B=B.next;b++;
        }
        int diff= Math.abs(a-b);
        if(a > b){
            while(diff-- >0){
                headA=headA.next;
            }
        }
        else{
            while(diff-- >0){
                headB=headB.next;
            }
        }
        while(headB!=null){
            if(headA == headB){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
}