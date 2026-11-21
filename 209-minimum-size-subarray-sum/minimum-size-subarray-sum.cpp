class Solution {
public:
    int minSubArrayLen(int t, vector<int>& nums) {
        int l=0;int r=0;
        int sum=0;int minimum=INT_MAX;
        while(r < nums.size()){
            sum += nums[r];
           while(sum >= t){
                minimum = min(minimum,r-l+1);
                sum = sum-nums[l];
                l++;
            }
            r++;
        }
        if(minimum == INT_MAX){
            return 0;
        }
        return minimum;

    }
};