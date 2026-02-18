class Solution {
    static int lower(int[] arr,int t){
        int l=0;int h=arr.length-1;int ans=arr.length;
        while(l <= h){
            int mid = (l+h)/2;
            if (arr[mid] >= t) {
                h = mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }

    static int upper(int[] arr,int t){
        int l=0;int h=arr.length-1;int ans=arr.length;
        while(l <= h){
            int mid = (l+h)/2;
            if (arr[mid] > t) {
                h = mid-1;
            }else{
                l=mid+1;
            }
        }
        return h;
    }
   
    public int[] searchRange(int[] arr, int tar){
        int[] ans =new int[2];
        ans[0] = -1;ans[1] = -1;
      int l=  lower(arr,tar);
       int h = upper(arr,tar);
       if(l == arr.length || arr[l] != tar){return ans;}
       ans[0] = l;ans[1] = h;
       return ans;
    }
}