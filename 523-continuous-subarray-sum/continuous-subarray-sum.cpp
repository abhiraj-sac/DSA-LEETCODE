class Solution {
public:
    bool checkSubarraySum(vector<int>& nums, int k) {
        unordered_map<int,int> map;
        map[0]=-1;
        int sum=0;int prefix=0;
        // if(k ==0){return true;}
        for(int i=0;i<nums.size();i++){
              prefix += nums[i];
              int rem = (prefix % k) ;
            //   if(rem == 0 && i >= 1){return true;}
              if(map.count(rem)){
                if(i - map[rem] >= 2){return true;}
              }
              else{map[rem] = i;}
        }
        return false;
    }
};