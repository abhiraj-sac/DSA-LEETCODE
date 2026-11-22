class Solution {
public:
    int threeSumClosest(vector<int>& nums, int t) {
        sort(nums.begin(),nums.end());
        int mini=INT_MAX;int ans=INT_MAX;
        for(int r=0;r<nums.size();r++){
            int ind = r;
            int i = r+1;
            int j=nums.size()-1;
            while(i < j){
                int a = nums[ind]+nums[i]+nums[j];
                if(abs(t-a) < mini){
                    mini =abs(t-a);
                    ans =a;
                }
                if(a > t){
                    j--;
                }
                else{
                    i++;
                }
            }
        }
        return ans;
    }
};