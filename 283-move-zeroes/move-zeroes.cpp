class Solution {
        void swap(vector<int>& nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
public:
    void moveZeroes(vector<int>& nums) {
        int j=0;
        for(int i=0;i<nums.size();i++){
            while(j <i && nums[j] != 0){j++;}
            if(nums[j] == 0 && nums[i] != 0){swap(nums,i,j);}
        }
    }
};