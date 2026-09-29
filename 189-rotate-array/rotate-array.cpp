class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        int i=0;int j=nums.size()-1;
        k = k%nums.size();
        if(k == 0){return ;}
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;j--;
        }
        i=0;int c=k-1;
        while(i < c){
            int temp = nums[i];
            nums[i] = nums[c];
            nums[c] = temp;
            i++;c--;
        }
        j = nums.size()-1;
        while(k < j){
            int temp = nums[k];
            nums[k] = nums[j];
            nums[j] = temp;
            k++;j--;
        }
    }
};