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
    bool isValidBST(TreeNode* root) {
        return val(root,LLONG_MIN,LLONG_MAX);
    }
     bool val(TreeNode* root,long long min, long long maxx){
        if(root == NULL){return true;}
        if(root -> val >= maxx || root -> val <= min ){
            return false;
        }
        return val(root -> left,min,root -> val)&&
               val(root -> right, root -> val,maxx);  
    }
};