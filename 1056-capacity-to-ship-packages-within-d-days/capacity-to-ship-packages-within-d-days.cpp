class Solution {
public:
int bhaar(vector<int>& nums, int mid){
    int load=0;int days=1;
    for(int i=0;i<nums.size();i++){
        if(load + nums[i] > mid){
            days += 1;
            load = nums[i];
        }
        else{
            load += nums[i];
        }
    }
    return days;
}
    int shipWithinDays(vector<int>& nums, int days) {
        int sum=0;int m=INT_MIN;
        for(int i=0;i<nums.size();i++){
            sum += nums[i];
            m = max(m,nums[i]);
        }
        int l=m;int h=sum;int ans=0;
        while(l <= h){
            int mid =(l+h)/2;
            if(bhaar(nums,mid) <= days){
                ans = mid;
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return ans;
    }
};