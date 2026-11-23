class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int l=0;int h=nums.size()-1;
        while(l < h){
            if(nums[l]+nums[h] == target){
                 vector<int> p = {l+1,h+1};
                 return p;
            }
            else if(nums[l]+nums[h] > target){
                h--;
            }
            else{l++;}
        }
        vector<int> p={-1};
        return p;
    }
};