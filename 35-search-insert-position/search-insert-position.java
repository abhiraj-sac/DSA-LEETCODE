class Solution {
    public int searchInsert(int[] arr, int target) {
        int l=0;int h=arr.length-1;int ans=arr.length;int flag=0;
        while(l <= h){
            int mid = (l+h)/2;
            if(arr[mid] == target){ans=mid;flag =1;break;}
            else if(arr[mid] > target){
                ans = mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        if(flag == 1){return ans;}
        return ans;
    }
}