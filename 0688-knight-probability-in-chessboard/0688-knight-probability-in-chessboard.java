class Solution {
       
    public double knightProbability(int n, int k, int row, int column) {
       double dp[][][] = new double[n][n][k + 1];
        int di[] = {1, 2, 1, 2, -1, -1, -2, -2};
        int dj[] = {2, 1, -2, -1, 2, -2, 1, -1};
        dp[row][column][0] = 1;
        for (int step = 1; step <= k; step++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dp[i][j][step - 1] != 0) {
                        for (int y = 0; y < 8; y++) {
                            int ni = i + di[y];
                            int nj = j + dj[y];
                            if (ni >= 0 && ni < n && nj >= 0 && nj < n) {
                                dp[ni][nj][step] += dp[i][j][step - 1] / 8.0;
                            }
                        }
                    }
                }
            }
        }
        double ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans += dp[i][j][k];
            }
        }
        return ans;

    }

}