class Solution {
public:
    int subarraysDivByK(vector<int>& nums, int k) {
        int prefix=0;int c=0;
        unordered_map<int,int> map; map[0]=1;
        for(int i=0;i<nums.size();i++){
            prefix += nums[i];
            int rem = ((prefix % k) + k) % k;
            if(map.count(rem)){
              c +=  map[rem];
            }
            map[rem]++;
        }
        return c;
    }
};