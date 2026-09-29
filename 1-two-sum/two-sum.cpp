class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int t) {
         unordered_map<int,int> map;
        vector<int> arr;
        for(int i=0;i<nums.size();i++){
            if(map.count(t-nums[i])){
                arr.push_back(i);
                arr.push_back(map[t-nums[i]]);
                return arr;
            }
            map[nums[i]] = i;
        }
        return arr;
    }
};