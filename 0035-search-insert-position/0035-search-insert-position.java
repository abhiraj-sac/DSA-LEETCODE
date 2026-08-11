class Solution {
    public int searchInsert(int[] arr, int t) {
        int l=0;int h=arr.length-1;
        int ans=arr.length;
        while(l <= h){
         int mid = (l+h)/2;
         if(arr[mid] >= t){
            ans = mid;
            h = mid-1;
         }
         else{
            l = mid+1;
         }
        }    
        return ans;
        }
}