class Solution {
    public int longestOnes(int[] arr, int k) {
         int maxlen=0;int l=0;int r=0;int zero=0;int len=0;
        while(r < arr.length){
            if(arr[r] == 0){zero++;}
            while(zero > k){
                if(arr[l]==0){zero--;}
                l++;
            }
            if(zero <= k){
                len = r-l+1;
                maxlen = Math.max(maxlen,len);
            }
            r++;
        }
        return maxlen;
    }
}