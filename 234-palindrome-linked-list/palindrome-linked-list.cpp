/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    bool isPalindrome(ListNode* head) {
        ListNode* s =head;
        ListNode* f =head;
        while(f != nullptr && f->next != nullptr){
            s = s->next;
            f = f->next->next;
        }
        ListNode* curr = s;
        ListNode* prev = nullptr;
        ListNode* next = nullptr;
        while(curr != nullptr){
            next  =curr -> next;
            curr -> next  = prev;
            prev =curr;
            curr = next;
        }
        while(prev != nullptr){
            if(head-> val != prev -> val){
                return false;
            }
            prev = prev -> next;
            head = head -> next;
        }
        return true;
    }
};