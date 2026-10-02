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
    vector<int> preorderTraversal(TreeNode* root) {
        vector<int> arr;
        help(root,&arr);
        return arr;
    }
    void help(TreeNode* root, vector<int>* arr){
        if(root == nullptr){
            return ;
        }
        arr -> push_back(root -> val);
        help(root -> left , arr);
        help(root -> right ,arr);
    }
};