class Solution {
public:
    int shortestSubarray(vector<int>& nums, int k) {
    int n = nums.size();
    // Prefix Sum
    vector<long long> prefix(n + 1, 0);
    int i = 0;
    while (i < n) {
        prefix[i + 1] = prefix[i] + nums[i];
        i++;
    }
    deque<int> dq;
    int ans = n + 1;
    i = 0;
    while(i <= n){
        while(!dq.empty() && prefix[i] - prefix[dq.front()] >= k){
            ans = min(ans,i- dq.front());
            dq.pop_front();
        }
        while(!dq.empty() && prefix[i] <= prefix[dq.back()]){
            dq.pop_back();
        }
        dq.push_back(i);i++;
    }
    return ans == n + 1 ? -1 : ans;
    }
};