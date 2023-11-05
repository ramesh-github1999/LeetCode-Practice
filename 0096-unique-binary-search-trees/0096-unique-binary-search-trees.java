class Solution {
    // nth catlan no
    public int numTrees(int n) {
        int dp[] =new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for (int i = 2; i <=n; i++) {
            int start=0;
            int end=i-1;
            while (end>=0){
                dp[i]+=dp[start]*dp[end];
                start++;
                end--;
            }
        }
        return dp[n];
    }
}