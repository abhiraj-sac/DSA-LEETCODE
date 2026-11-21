class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        map<char,int> map;
        int l=0;int r=0;int maximum=0;
        while(r < s.size()){
            if(map.count(s[r]) && map[s[r]] >= l){
                l = map[s[r]]+1;
            }
            maximum = max(maximum , (r-l+1));
            map[s[r]]=r;r++;
        }
        return maximum;
    }
};