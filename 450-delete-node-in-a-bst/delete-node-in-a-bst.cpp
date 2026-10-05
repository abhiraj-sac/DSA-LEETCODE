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
    TreeNode* deleteNode(TreeNode* root, int key) {
        if(root == NULL){return root;}
        if(root->val == key){return help(root);}

        TreeNode* dummy = root;
        while(root != NULL){
            if(root->val >key){
                if(root->left != NULL && root->left->val == key){
                    root->left = help(root->left);
                }
                else{
                    root = root->left;
                }
            }
            else{
                if(root->right != NULL && root->right->val == key){
                    root->right = help(root->right);
                }
                else{
                    root = root->right;
                }
            }
        }
        return dummy;
    }
    TreeNode* help(TreeNode* root){
        if(root ->left == NULL){
            return root->right;
        }
        else if(root -> right == NULL){
            return root -> left;
        }
        TreeNode* rightchild = root->right;
        TreeNode* leftchild  = findlast(root->left);
        leftchild->right = rightchild;
        return root->left;
    }
    TreeNode* findlast(TreeNode* root){
        if(root -> right == NULL){
            return root;
        }
        return findlast(root->right);
    }
};