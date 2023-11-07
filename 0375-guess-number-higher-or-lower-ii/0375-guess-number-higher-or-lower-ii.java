class Solution {
     int dp[][];
    int fun(int l,int h){
        if(l>=h) return 0;
        if(dp[l][h]!=0) return dp[l][h];
        int ans=Integer.MAX_VALUE;
        for (int i = l; i <=h; i++) {
            ans=Math.min(ans,Math.max(i+fun(l,i-1),i+fun(i+1,h)));
        }
        return dp[l][h]=ans;
    }
    public int getMoneyAmount(int n) {
        dp=new int[n+1][n+1];
        return fun(1,n);

    }
}