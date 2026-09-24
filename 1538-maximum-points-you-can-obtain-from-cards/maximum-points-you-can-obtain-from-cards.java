class Solution {
    public int maxScore(int[] arr, int k) {
        int lsum=0;int  rsum=0;
        int sum =0;int max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            lsum += arr[i]; 
        }
        max = lsum;
        int j=0;int n=arr.length;
        for(int i = k-1;i>=0;i--){
            lsum  -= arr[i];
            rsum += arr[n-1-j];
            j++;
            max = Math.max(max,lsum+rsum);
        }
        return max;
    }
}