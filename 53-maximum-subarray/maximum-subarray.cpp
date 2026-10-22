class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int maxs = INT_MIN;
        int sum =0;
        for(int i=0;i<nums.size();i++){
            sum += nums[i];
            if(sum < 0){
                maxs =max(maxs,sum);
                sum=0;
            }
            else{
                maxs =max(maxs,sum);
            }
        }
        return maxs;
    }
};