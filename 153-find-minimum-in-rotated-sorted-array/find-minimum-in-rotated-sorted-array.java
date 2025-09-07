class Solution {
    public int findMin(int[] arr) {
        int l=0;int h=arr.length-1;
        int mid=0;
        int ans = Integer.MAX_VALUE;
        while(l <= h){
            mid = (l+h)/2;
            if(arr[l] <= arr[mid]){
                ans =Math.min(ans,arr[l]);
                l = mid+1;
            }
            else{
                ans =Math.min(ans,arr[mid]);
                h=mid-1;
            }
        }
        return ans;
    }
}