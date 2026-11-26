class Solution {
public:
    vector<int> dailyTemperatures(vector<int>& nums) {
        stack<pair<int,int>> st;
        vector<int> vec;
        for(int i=nums.size()-1;i>=0;i--){
            while(!st.empty() && nums[i] >= st.top().first){
                st.pop();
            }
            int x = st.empty()?0:st.top().second - i;
            vec.push_back(x);
            st.push({nums[i],i});
        }
          reverse(vec.begin(), vec.end());      
       return vec;
    }
};