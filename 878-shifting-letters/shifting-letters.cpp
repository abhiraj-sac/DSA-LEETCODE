class Solution {
public:
    string shiftingLetters(string s, vector<int>& shifts) {
        int cum=0;
      for(int i=shifts.size()-1;i >=0;i--){
           cum += shifts[i]%26;
           s[i] ='a'+((s[i] - 'a') + cum)%26;
      }
      return s;
    }
};