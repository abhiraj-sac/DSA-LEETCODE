class Solution {
public:
    int findMiddleIndex(vector<int>& nums) {
        int sum = 0;
        for(int i=0;i<nums.size();i++){
            sum += nums[i];
        }
        int presum=0;
        for(int i=0;i<nums.size();i++){

            if(presum == (sum -presum - nums[i])){
                return i;
            }
             presum+=nums[i];
        }
        return -1;
    }
};