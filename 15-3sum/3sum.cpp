class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        vector<vector<int>> ans;
        for(int r =0 ;r<nums.size();r++){
            if(r > 0 && nums[r] == nums[r-1]) continue;
            int ind =r;
            int i=r+1;
            int j =nums.size()-1;
            while(i < j){
                if(nums[ind]+nums[i]+nums[j] == 0){
                    vector<int> p = {nums[ind],nums[i],nums[j]};
                            ans.push_back(p);
                    i++;j--;
                    while(i < j && nums[i] == nums[i-1]) i++;
                    while(i < j && nums[j] == nums[j+1]) j--;
                }
                else if(nums[ind]+nums[i]+nums[j] < 0){
                    i++;
                }
                else{j--;}
            }
        }
        return ans;
    }
};