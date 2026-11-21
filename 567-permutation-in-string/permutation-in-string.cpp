class Solution {
public:
    bool checkInclusion(string s1, string s2) {
         vector<int> need(26, 0);
        vector<int> window(26, 0);
         for(char ch:s1){
            need[ch -'a']++;
         }
         int k=s1.size();
         int l=0;
         for(int r=0;r<s2.size();r++){
            window[s2[r] - 'a']++;
            if(r-l+1 > k){
                window[s2[l] - 'a']--;
                l++;
            }
            if(r - l + 1 == k && need == window) {
                return true;
            }
         }
         return false;

    }
};