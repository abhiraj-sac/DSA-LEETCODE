class Solution {
public:
    int findKthPositive(vector<int>& arr, int k) {
        int l=0;int h=arr.size()-1;
        if(arr[arr.size()-1] - arr.size() == 0){return arr[arr.size()-1] + k;}

        while(l <= h){
            int mid = (l+h)/2;
            int missing  = arr[mid]  - (mid+1);
            if(missing < k){
                l = mid+1;
            }
            else{
                h =mid-1;
            }
        }  
        return l+k;
    }
};