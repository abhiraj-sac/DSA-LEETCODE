class Solution {
public:
    vector<int> nextGreaterElements(vector<int>& nums) {
        stack<int> s ;
        vector<int> ans(nums.size());
        for(int i=nums.size()-1 ;i >= 0 ;i--){
            while(!s.empty() && s.top() <= nums[i]){
                s.pop();
            }
            int x = s.empty() ? -1:s.top();
            if(s.empty() && x == -1){
                bool flag  =true;
                for(int j = 0 ; j< i;j++){
                    if(nums[j] > nums[i]){
                        flag = false;
                        ans[i] = nums[j];
                        break;
                    }
                }
                if(flag == true){
                    ans[i] = -1;
                }
                
            }
            else{
                 ans[i] = s.top();   
                }
                s.push(nums[i]);
        }
        return ans;
    }
};