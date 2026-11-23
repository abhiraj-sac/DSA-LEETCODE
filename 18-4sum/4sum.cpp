class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        sort(nums.begin(), nums.end());

        vector<vector<int>> ans;
        int n = nums.size();

        for(int r = 0; r < n-3; r++) {

            if(r > 0 && nums[r] == nums[r-1])
                continue;

            for(int ind2 = r+1; ind2 < n-2; ind2++) {

                if(ind2 > r+1 && nums[ind2] == nums[ind2-1])
                    continue;

                int i = ind2+1;
                int j = n-1;

                while(i < j) {

                    long long sum = (long long)nums[r] + nums[ind2] + nums[i] + nums[j];

                    if(sum == target) {

                        ans.push_back({nums[r], nums[ind2], nums[i], nums[j]});

                        i++;
                        j--;

                        while(i < j && nums[i] == nums[i-1])
                            i++;

                        while(i < j && nums[j] == nums[j+1])
                            j--;
                    }

                    else if(sum < target) {
                        i++;
                    }

                    else {
                        j--;
                    }
                }
            }
        }

        return ans;
    }
};