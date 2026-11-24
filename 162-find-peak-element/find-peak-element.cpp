class Solution {
public:
    int findPeakElement(vector<int>& nums) {
        if(nums.size()==1){return 0;}
        int l=1;int h=nums.size()-2;
        while(l <= h){
            int mid=(l+h)/2;
            if(nums[mid-1] < nums[mid] && nums[mid+1] < nums[mid]){return mid;}
            if(nums[mid] < nums[mid+1]){
                l = mid+1;
            }else{
                h = mid-1;
            }
        }
        if(nums.size() > 1 && nums[0] > nums[1]){return 0;}
         if(nums.size() > 1 && nums[nums.size()-1] > nums[nums.size()-2]){return nums.size()-1;}
         return -1;
    }
};