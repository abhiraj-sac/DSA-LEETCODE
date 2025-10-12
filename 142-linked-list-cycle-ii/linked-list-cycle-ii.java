/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast =head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow= head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
        // if (head == null) return null;

        // HashMap<ListNode, Integer> map = new HashMap<>();
        // ListNode curr = head;
        // int pos = 0;

        // while (curr != null) {
        //     if (map.containsKey(curr)) {
        //         return curr;
        //     }
        //     map.put(curr, pos++);
        //     curr = curr.next; 
        // }

        // return null; 
    }
}