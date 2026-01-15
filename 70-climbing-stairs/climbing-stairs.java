class Solution {
    int[] dp;

    public int climbStairs(int n) {
        // if(n == 0){return 1;}
        // if(n ==1){return 1;}
        // int left = climbStairs(n-2);
        // int right = climbStairs(n-1);
        // return left +right;
          dp = new int[n+1];
          Arrays.fill(dp,-1);
          return help(n,dp);
    }
    int help(int n,int[] dp){
        if(n <= 1){return 1;}
        if(dp[n] != -1){return dp[n];}
       return dp[n] = help(n-1,dp) + help(n-2,dp);
    }
}