class Solution {
public:
vector<int> nrs(vector<int>& h){
        stack<int> st;
        int n= h.size();
        vector<int> left;
        for(int i=h.size()-1;i>=0;i--){
            while(!st.empty() && h[st.top()] >= h[i]){
                 st.pop();
            }
            int x = st.empty()?n:st.top();
            st.push(i);
            left.push_back(x);
        }
         reverse(left.begin(),left.end());
         return left;
    }

    vector<int> nls(vector<int>& h){
        stack<int> st;
        int n= -1;
        vector<int> right;
        for(int i=0;i < h.size();i++){
            while(!st.empty() && h[st.top()] >= h[i]){
                 st.pop();
            }
            int x = st.empty()?n:st.top();
            st.push(i);
            right.push_back(x);
        }
        return right;
    }
    int maximalRectangle(vector<vector<char>>& arr) {
        int m=0;
        vector<int> ans(arr[0].size(), 0);
        for(int i=0;i<arr.size();i++){
            int k=0;
            for(int j=0;j<arr[0].size();j++){
                if(arr[i][j] == '0'){
                    ans[k++] = 0;
                }
                else{
                 ans[k++] = ans[j] + 1; 
                }  
            }
       vector<int> l= nrs(ans);
       vector<int> r= nls(ans);
       for(int i=0;i<ans.size();i++){
        m =max(m , ((l[i]-r[i])-1)*ans[i]);
       }
        }
        return m;
    }
};  