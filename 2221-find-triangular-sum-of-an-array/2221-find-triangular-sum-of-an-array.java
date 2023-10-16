class Solution {
    public int triangularSum(int[] nums) {
        int n=nums.length;
        int dp[][]=new int[n+1][n+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                dp[i][j]=0;
            if(i==0) dp[i][j]=nums[j];
            }
        }
        
        for(int i=1;i<n;i++){
            for(int j=0;j<n-i;j++){
                dp[i][j]=(dp[i-1][j]+dp[i-1][j+1])%10;
            }
        }
        return dp[n-1][0];
    }
}