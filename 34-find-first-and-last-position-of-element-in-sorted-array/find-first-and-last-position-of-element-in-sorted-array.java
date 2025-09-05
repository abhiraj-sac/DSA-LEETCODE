class Solution {
    static  int lower(int[] arr,int t){
        int l=0;int h=arr.length-1;int mid=0;int ans=arr.length;
        while(l <= h){
            mid = (l+h)/2;
            if(arr[mid] >= t){
                ans = mid;
                h=mid-1;
            }
            else{
                l =mid+1;
            }
        }
        return ans;
    }
    static  int upper(int[] arr,int t){
        int l=0;int h=arr.length-1;int mid=0;int ans=arr.length;
        while(l <= h){
            mid = (l+h)/2;
            if(arr[mid] > t){
                ans = mid;
                h=mid-1;
            }
            else{
                l =mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] arr, int tar){
        int l = lower(arr,tar);
        int u =upper(arr,tar);
        int[] ans = new int[2];
        if(l == arr.length || arr[l] != tar){
            return new int[]{-1, -1};
        }
        return new int[]{l,u-1}; 
    }
}