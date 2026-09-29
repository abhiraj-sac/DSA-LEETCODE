class Solution {
  int sumofdiv(int mid, vector<int>& nums){
    int div=0;int sum=0;
    for(int i=0;i<nums.size();i++){
        div = (nums[i] + mid - 1) / mid;
        sum += div;
    }
    return sum;
  }
public:
    int smallestDivisor(vector<int>& nums, int k) {
        int m=0;
        for(int i=0;i<nums.size();i++){
             m = max(m,nums[i]);
        }
        int l=1;int h=m;int ans=0;
        while(l < h){
            int mid = (l+h)/2;
            if(sumofdiv(mid, nums) <= k){
               ans = nums[mid];
               h = mid;
            }
            else{
                l = mid+1;
            }
        }
        return l;

    }
};