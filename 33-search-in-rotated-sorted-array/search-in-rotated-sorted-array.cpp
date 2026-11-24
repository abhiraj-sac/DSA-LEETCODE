class Solution {
public:
    int search(vector<int>& nums, int t) {
        int l=0;int h=nums.size()-1;
        while(l <= h){
            int mid = (l+h)/2;
            if(nums[mid] == t){return mid;}
            if(nums[l] <= nums[mid]){
                if(nums[l] <= t && nums[mid] > t){
                    h = mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else{
                if(nums[mid] < t && nums[h] >= t){
                    l = mid+1;
                }
                else{
                    h= mid-1;
                }
            }
        }
        return -1;
    }
};