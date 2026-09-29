class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        unordered_set<int> set;
        for(int i=0;i<nums.size();i++){
            set.insert(nums[i]);
        }int count =0;int maxi=0;
        for(auto x:set){
            if(!set.count(x-1)){
                int t =x;count=0;
                while(set.count(t)){
                    t++;count++;
                }
                maxi = max(maxi,count);
            }
        }
        return maxi;
    }
};