class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n=arr.length;
        int l=0;int h=n-2;int mid=0;
        if(n==1){return arr[0];}
        if(arr[0] != arr[1]){return arr[0];}
        if(arr[n-2] != arr[n-1]){return arr[n-1];}
        while(l <=h){
            mid = (l+h)/2;
            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]){
                return arr[mid];
            }
            //check for left bro 
            if(mid % 2 == 1 && arr[mid] == arr[mid-1] || mid % 2 == 0 && arr[mid] == arr[mid+1]){
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }
        return -1;
    }
}