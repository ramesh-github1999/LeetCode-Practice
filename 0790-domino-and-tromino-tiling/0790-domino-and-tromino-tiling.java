class Solution {
    public int numTilings(int n) {
      if(n<=2) return n;
        long dp[]=new long[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        dp[3]=5;
        int mod=(int) Math.pow(10,9)+7;
        for(int i=4;i<=n;i++){
            dp[i]=((2*dp[i-1])%mod+dp[i-3]%mod)%mod;
        }
        return (int)dp[n]%mod;
    }
    /*
1
2   
3
4
5
6
7
8
9
10

1
2
5
11
24
53
117
258
569
1255

    */
}