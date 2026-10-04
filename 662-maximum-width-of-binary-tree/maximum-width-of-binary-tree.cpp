class Solution {
public:
    int widthOfBinaryTree(TreeNode* root) {
        if(!root){
            return 0;
        }

        queue<pair<TreeNode*, long long>> q;
        q.push({root, 0});

        int ans = 0;

        while(!q.empty()) {
            int size = q.size();

            long long nmin = q.front().second;
            long long f, l;

            for(int i = 0; i < size; i++) {

                long long curr_id = q.front().second - nmin;
                TreeNode* node = q.front().first;
                q.pop();

                if(i == 0)
                    f = curr_id;

                if(i == size - 1)
                    l = curr_id;

                if(node->left)
                    q.push({node->left, curr_id * 2 + 1});

                if(node->right)
                    q.push({node->right, curr_id * 2 + 2});
            }

            ans = max(ans, (int)(l - f + 1));
        }

        return ans;
    }
};