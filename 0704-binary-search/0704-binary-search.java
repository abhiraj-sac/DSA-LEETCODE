class Solution {
    public int search(int[] arr, int t) {
        int l=0;int h=arr.length-1;
        while(l <= h){
            int mid = (l+h)/2;
            if(arr[mid] == t){
                return mid;
            }
            else if(arr[mid] < t){
                l=mid+1;
            }
            else{
                h = mid-1;
            }
        }
        return -1;
    }
}