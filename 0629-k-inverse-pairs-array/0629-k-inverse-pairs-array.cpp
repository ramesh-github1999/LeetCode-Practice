class Solution {
public:
    int kInversePairs(int n, int k) {
        if(k==0) return 1;
        vector<vector<int>>dp(n+1,vector<int>(k+1,0));
        for(int i=0;i<=n;i++){
            for(int j=0;j<=k;j++){
                if(i==0) dp[i][j]=0;
                else if(j==0) dp[i][j]=1;
                else{
                for(int p=0;p<=min(j,i-1);p++){
                    dp[i][j]=(dp[i][j]+dp[i-1][j-p])%1000000007;
                }
                }
            }
        }
        return dp[n][k];
    }
};