class Solution {
public:
    vector<int> asteroidCollision(vector<int>& nums) {
        stack<int> st;

        for(int i = 0; i < nums.size(); i++) {
while(!st.empty() &&
                  nums[i] < 0 &&
                  st.top() > 0 &&
                  abs(nums[i]) > st.top()) {
                st.pop();
            }
            if(st.empty() && nums[i] < 0) {
                st.push(nums[i]);
                continue;
            }

            else if(!st.empty() && nums[i] < 0 &&
                    st.top() > 0 && abs(nums[i]) < st.top()) {
                continue;
            }

            else if(!st.empty() && nums[i] < 0 &&
                    st.top() > 0 && abs(nums[i]) == st.top()) {
                st.pop();
                continue;
            }

            
            if(!st.empty() && nums[i] < 0 && st.top() > 0 && st.top() > abs(nums[i])){
                continue;
            }

            st.push(nums[i]);
        }

        vector<int> ans;

        while(!st.empty()) {
            ans.push_back(st.top());
            st.pop();
        }

        reverse(ans.begin(), ans.end());

        return ans;
    }
};