class Solution {
public:
    int low(vector<int>& nums, int t){
       int l=0;int h=nums.size()-1;
       while(l <= h){
        int mid = (l+h)/2;
        if(nums[mid] >= t){
            h= mid-1;
        }
        else{
           l = mid+1;
        }     
       }
       return l;
    }
    int high(vector<int>& nums, int t){
         int l=0;int h=nums.size()-1;
       while(l <= h){
        int mid = (l+h)/2;
        if(nums[mid] > t){
            h= mid-1;
        }
        else{
          l = mid+1;
        }  
       }
       return h;
    }
    vector<int> searchRange(vector<int>& nums, int t) {
        if(nums.size() == 0){return {-1,-1};}
        vector<int> res = {-1,-1};
       int l = low(nums,t);
       int h= high(nums,t);
       if(l == nums.size() || nums[l] != t){return res;}
       res[0] =l;res[1]=h;
       return res;
       
    }
};