class Solution {
public:
    vector<int> nextGreaterElements(vector<int>& nums) {
        stack<int> st;
        vector<int> ans(nums.size());
        for(int i=nums.size()-1;i>=0;i--){
            while(!st.empty() && nums[i] >= st.top()){
                st.pop();
            }
            int x =st.empty()?-1:st.top();
            if(st.empty() &&x == -1){
                bool flag = false;
                for(int j=0;j<i;j++){
                    if(nums[j] > nums[i]){
                        ans[i] = nums[j];
                        flag = true;
                        break;
                    }
                }
                if(flag == false){
                   ans[i] = -1;
                }
            }
            else{
                ans[i] = x;
            }
            st.push(nums[i]);
        }
        return ans;
    }
};