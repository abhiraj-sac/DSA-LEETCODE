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
    void inorder(TreeNode* root,vector<int>* inmap){
        if(root == NULL){return;}
        inorder(root->left,inmap);
        inmap->push_back(root->val);
        inorder(root->right,inmap);
    }
public:
    bool findTarget(TreeNode* root, int k) {
        vector<int> inmap;
        inorder(root,&inmap);
        // return inmap;
        map<int,int> m;
        for(int i =0;i< inmap.size();i++){
             if(m.count(k-inmap[i])){
                return true;
             }
             m[inmap[i]] = i; 
        }
        return false;
    }
    
};