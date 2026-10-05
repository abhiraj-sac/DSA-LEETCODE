/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
    void parentmark(TreeNode* root,unordered_map<TreeNode*,TreeNode*>& parent_track){
          queue<TreeNode*> queue;
          queue.push(root);
          while(!queue.empty()){
            TreeNode* current = queue.front();
            queue.pop();
            if(current -> left){
                parent_track[current->left] = current;
                queue.push(current->left);
            }
            if(current -> right){
                parent_track[current->right] = current;
                queue.push(current->right);
            }
          }
    }

public:
    vector<int> distanceK(TreeNode* root, TreeNode* t, int k) {
        unordered_map<TreeNode*,TreeNode*> parent_track;
        parentmark(root,parent_track);
        queue<TreeNode*> queue;
        unordered_map<TreeNode*,bool> vis;
        vis[t] = true;
        int curr_lev = 0;
        queue.push(t);
        while(!queue.empty()){
            int size = queue.size();
            if(curr_lev++ == k){break;}
            for(int i=0;i<size;i++){
                TreeNode* curr  =queue.front();
                queue.pop();
                if(curr -> left != NULL && !vis[curr -> left]){
                    queue.push(curr -> left);
                    vis[curr -> left] =true;
                }
                if(curr -> right != NULL && !vis[curr -> right]){
                    queue.push(curr -> right);
                    vis[curr -> right] =true;
                }
                if(parent_track[curr] && !vis[parent_track[curr]]){
                    queue.push(parent_track[curr]);
                    vis[parent_track[curr]] =true;
                }
            }
        }
        vector<int> res;
        while(!queue.empty()){
            TreeNode* f = queue.front();queue.pop();
             res.push_back(f->val);
        }
        return res;
    }
};