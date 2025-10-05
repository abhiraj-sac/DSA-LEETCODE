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
    public boolean isPalindrome(ListNode head) {
        ListNode l = head;
        ListNode a =head;
        int c=0;
        while(l != null){
            l =l.next;
            c++;
        }
        int[] arr=new int[c];
        int i=0;
        while(a != null){
            arr[i++] = a.val;
            a = a.next;
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j] != arr[arr.length-1-j]){
                return false;
            }
}
        return true;

    }
}