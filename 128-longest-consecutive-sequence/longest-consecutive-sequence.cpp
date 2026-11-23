class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        unordered_set<int> set;
        if(nums.size()==0){return 0;}
        for(int i=0;i<nums.size();i++){
            set.insert(nums[i]);
        }
        int maxi=0;
        for(auto s:set){
            if(!set.count(s-1)){
                int x =s;int count=0;
                while(set.count(x)){
                    count++;
                    maxi=max(maxi,count);
                    x++;
                }
            }
        }return maxi;
    }
};