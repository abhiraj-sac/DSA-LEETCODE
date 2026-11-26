class Solution {
public:
    string shiftingLetters(string s, vector<vector<int>>& shifts) {
        vector<int> diff(s.size()+1,0);
        vector<int> ans(s.size()+1,0);
        for(auto x:shifts){
            int start =x[0];
            int end =x[1];
            int i=x[2];
            if(i == 0){
                diff[start] -= 1;
                diff[end+1] += 1;
            }
            else{
                diff[start] += 1;
                diff[end+1] -= 1;
            }
        }
        int sum=0;
        for(int i=0;i<diff.size();i++){
           sum += diff[i];
           ans[i] = sum;
        }
        for(int i=0;i<ans.size()-1;i++){
            s[i] = 'a' + (((s[i] - 'a' + ans[i])%26)+26)%26;
        }
        return s;
    }
};