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
        ListNode curr = head;
        ArrayList<Integer> values = new ArrayList<>();
        while(curr != null){
            values.add(curr.val);
            curr = curr.next;
        }
         int i = 0, j = values.size() - 1;
        while(i <j){
            if(!values.get(i).equals(values.get(j))){
                return false;
            }
            else{
            i++;
            j--;
            }
        }
        return true;
    }
}