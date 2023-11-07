class Solution {
    int solveTab(int n){
        int dp[][]=new int[n+2][n+2];
        for (int start = n; start >=1; start--) {
            for (int end = start; end <=n; end++) {
                if (start==end) continue;
                int maxi=Integer.MAX_VALUE;
                for (int i = start; i <=end; i++) {
                    maxi=Math.min(maxi,Math.max(i+dp[start][i-1],i+dp[i+1][end]));
                }
                dp[start][end]=maxi;

            }
        }
        return dp[1][n];
    }
    public int getMoneyAmount(int n) {
         return solveTab(n);
    }
}