class Solution {
    public int findPeakElement(int[] arr) {
        int l=1;int h=arr.length-2;
        int mid=0;
        if(arr.length == 1){return 0;}
        while(l <= h){
            mid =(l+h)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){return mid;}
            if(arr[mid] < arr[mid+1]){
                l=mid+1;
            }
            else{
                h = mid-1;
            }
        }
        if(arr[0] > arr[arr.length-1]){return 0;}
        if(arr[0] < arr[arr.length-1]){return arr.length-1;}
        return 0;
    }
}