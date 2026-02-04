class Solution {
    public int help(int[] nums,int k){
        int r=0;int l=0;int sum=0;int count=0;
        while(r < nums.length){
            sum += nums[r]%2;
            while(sum > k){
                sum = sum - nums[l]%2;
                l++;
            }
            count= count+(r-l+1);
            r++;
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
     int a=   help(nums,k);
      int b=  help(nums,k-1);
      return a-b;
    }
}