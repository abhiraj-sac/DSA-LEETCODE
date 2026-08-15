class Solution {
    public int longestOnes(int[] nums, int k) {
    //  int maxlen=0;int l=0;int r=0;int zero=0;int len=0;
    //  while(r < nums.length){
    //     if(nums[r] == 0){zero++;}
    //     while(zero > k){
    //         if(nums[l] == 0){zero--;}
    //         l++;
    //     }
    //     if(zero <= k){
    //          len = r-l+1;
    //             maxlen = Math.max(maxlen,len);
    //     }
    //     r++;
    //  }
    //  return maxlen;
        int maxlen=0;int l=0;int r=0;int zero=0;int len=0;
        while(r < nums.length){
            if(nums[r] == 0){zero++;}
            while(zero > k){
                if(nums[l] == 0){
                    zero--;
                }
                l++;}
                if(zero <= k){
                    len = r-l+1;
                    maxlen = Math.max(maxlen,len);
                }
                r++;
        }
       return maxlen;
    }
}