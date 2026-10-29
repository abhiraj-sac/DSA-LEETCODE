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
    int largestRectangleArea(vector<int>& h) {
        int m=0;
        if(h.size() == 1){
            return h[0];
        }
       vector<int> l= nrs(h);
       vector<int> r= nls(h);
       for(int i=0;i<h.size();i++){
        m =max(m , ((l[i]-r[i])-1)*h[i]);
       }
       return m;
    }
};