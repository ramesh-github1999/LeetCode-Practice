class Solution {
    public int countVowelPermutation(int n) {
         long dp[][]=new long [n][5];
        if(n==1) return 5;
        for(int i=0;i<5;i++) dp[0][i]=1;
        int mod=(int)Math.pow(10,9)+7;
        for(int i=1;i<n;i++){
            for (int j=0;j<5;j++){
                if(j==0) dp[i][j]=(dp[i-1][1]%mod+dp[i-1][2]%mod+dp[i-1][4]%mod)%mod;
                else if(j==1) dp[i][j]=(dp[i-1][0]%mod+dp[i-1][2]%mod)%mod;
                else if (j==2) dp[i][j]=(dp[i-1][1]%mod+dp[i-1][3]%mod)%mod;
                else if(j==3) dp[i][j]=dp[i-1][2]%mod;
                else dp[i][j]=(dp[i-1][2]%mod+dp[i-1][3]%mod)%mod;

        }
        }
       long  sum=0;
        for(int i=0;i<5;i++) sum=(sum%mod+dp[n-1][i]%mod)%mod;
        return (int)sum%mod;
    }
}