class Solution {
    long long  koko(int mid,vector<int>& nums){
        long long sum = 0;int div=0;
        for(int i=0;i<nums.size();i++){
            div = (nums[i] + mid - 1) / mid;
            sum += div;
        }
        return sum;
    }
public:
    int minEatingSpeed(vector<int>& nums, int h) {
        int maxi=INT_MIN;
        for(int i=0;i<nums.size();i++){
            maxi = max(maxi,nums[i]);
        }int l=1;int hi=maxi;int ans=0;
        while(l <= hi){
            int mid = (l+hi)/2;
            if(koko(mid,nums) <= h){
                ans = mid;
                hi = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return ans;
    }
};