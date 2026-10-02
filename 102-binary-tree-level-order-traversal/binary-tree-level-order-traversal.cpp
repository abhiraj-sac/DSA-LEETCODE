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
    vector<vector<int>> levelOrder(TreeNode* root) {
        queue<TreeNode*> q;
        vector<vector<int>> arr;
        if(root == nullptr){
            return arr;
        }
        q.push(root);
        while(!q.empty()){
            int size  =q.size();
            vector<int> arr1;
            for(int i=0;i<size;i++){
                TreeNode* curr = q.front();
                q.pop();
                if(curr -> left != nullptr){
                    q.push(curr -> left);
                }
                if(curr -> right != nullptr){
                    q.push(curr -> right);
                }
                arr1.push_back(curr->val);

            }
            arr.push_back(arr1);
        }
        return arr;
    }
};