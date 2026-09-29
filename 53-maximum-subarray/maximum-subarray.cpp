class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int sum =0;
        int m =INT_MIN;
        for(int i=0;i<nums.size();i++){
            sum += nums[i];
            if(sum < 0){
                m  =max(m,sum);
                sum=0;
            }
            else{
                m  =max(m,sum);
            }
        }
        return m;
    }
};