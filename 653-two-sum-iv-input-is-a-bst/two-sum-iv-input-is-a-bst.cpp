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
    class BSTIT{
        stack<TreeNode*> st;
        bool reverse = true; 
    public:
         BSTIT(TreeNode* root,bool isrev){
            reverse = isrev;
            pushall(root);
         }
    // public:

    int next(){
        TreeNode* node = st.top();
        st.pop();
        if (reverse) {
    pushall(node->left);
} else {
    pushall(node->right);
}
        return node->val;
    }
    private: 
    void pushall(TreeNode* node){
        for(;node!= NULL;){
            st.push(node);
            if(reverse == true){
                node = node->right;
            }
            else{
                node = node->left;
            }
        }
    }

    };
public:
    bool findTarget(TreeNode* root, int k) {
       if(!root){return false;}
       BSTIT l(root,false);
       BSTIT r(root,true);

       int i = l.next();
       int j = r.next();
       while(i < j){
        if( i+j == k){return true;}
        else if(i+j < k) i = l.next();
        else j = r.next();
       }
       return false;
    }
    
};