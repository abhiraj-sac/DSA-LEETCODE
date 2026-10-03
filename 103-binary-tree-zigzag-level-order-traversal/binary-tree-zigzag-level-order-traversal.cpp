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
    vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
      vector<vector<int>> f;
      if(root == nullptr){return f;}
      queue<TreeNode*> q;
      q.push(root);
      int c =0;
      while(!q.empty()){
        int size = q.size();
        vector<int> ans;
        for(int i=0;i<size;i++){
            TreeNode* curr = q.front();
            if(curr -> left != nullptr){
                q.push(curr -> left);
            }
            if(curr -> right != nullptr){
                q.push(curr -> right);
            }
            ans.push_back(curr -> val);
            q.pop();
            
        }
        if(c % 2 == 1){
            reverse(ans.begin(), ans.end());
            f.push_back(ans);
        }
        else{
        f.push_back(ans);
        }
        c++;
      }
      return f;
    }
};