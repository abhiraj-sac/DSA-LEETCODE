class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
     int c=0;int a=0;
     for(int i=0;i<nums.size();i++){
        if(nums[i] != nums[c]){
            nums[c+1] = nums[i];
            c++;a++;
        }
     } 
     return a+1;  
    }
};