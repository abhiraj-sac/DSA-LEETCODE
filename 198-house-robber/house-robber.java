class Solution {
    public int help(int n,int[] nums,int[] dp){
        if(n == 0){return nums[0];}
        if(n<0){return 0;}
        if(dp[n] != -1) {return dp[n];}
        int pick  = nums[n] + help(n-2,nums,dp);
        int notpick = 0 + help(n-1,nums,dp);
        return dp[n] = Math.max(pick,notpick);
    }
    public int rob(int[] nums) {
        int n= nums.length;
         if (n == 0) return 0;
        if (n == 1) return nums[0];
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
       return  help(n-1,nums,dp);
    }
}