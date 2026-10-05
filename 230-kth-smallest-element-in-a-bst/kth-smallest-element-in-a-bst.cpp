/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int kthSmallest(TreeNode* root, int k) {
        priority_queue<int, vector<int>, greater<int>> pq;
        help(root,pq); 
        for(int i=1; i<k; i++){
    pq.pop();
}

// cout << pq.top();
        return pq.top();
    }
    void help(TreeNode* root, priority_queue<int, vector<int>, greater<int>>& pq){
        if(root == NULL){
            return;
        }
        help(root->left,pq);
        pq.push(root->val);
        help(root->right,pq);
    }
};