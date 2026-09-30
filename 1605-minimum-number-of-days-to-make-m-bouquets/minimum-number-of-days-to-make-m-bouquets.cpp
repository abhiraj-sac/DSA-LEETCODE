class Solution {
    bool koko(int mid, vector<int>& nums, int m, int k){
    int flowers = 0;
    int bouquets = 0;

    for(int i = 0; i < nums.size(); i++){
        if(nums[i] <= mid){
            flowers++;

            if(flowers == k){
                bouquets++;
                flowers = 0;
            }
        }
        else{
            flowers = 0;
        }
    }

    return bouquets >= m;
}
public:
    int minDays(vector<int>& nums, int m, int k) {
        int maxi=INT_MIN;
        for(int i=0;i<nums.size();i++){
            maxi = max(maxi,nums[i]);
        }int l=1;int hi=maxi;int ans=-1;
        while(l <= hi){
            int mid = (l+hi)/2;
            if(koko(mid,nums,m,k) == true){
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