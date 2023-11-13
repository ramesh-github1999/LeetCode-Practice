class Solution {
     int mod = 1000 * 1000 * 1000 + 7;
   int dp[][][]=new int [50][50][51];
    
    int fun(int m, int n, int total, int i, int j) {


        if (i == m || j == n || i == -1 || j ==-1) return 1;
        if (total == 0) return 0;
        if(dp[i][j][total]>=0) return dp[i][j][total];
        dp[i][j][total]=((fun(m, n, total - 1, i + 1, j)%mod  +
                fun(m, n, total - 1, i - 1, j)%mod)%mod  +
                (fun(m, n, total - 1, i, j - 1)%mod  +
                fun(m, n, total - 1, i, j + 1)%mod ) % mod)%mod;
        return dp[i][j][total];
    }

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        for (int[][] l : dp) for (int[] sl : l) Arrays.fill(sl, -1);
        return fun(m, n, maxMove, startRow, startColumn);
        
    
    }
}