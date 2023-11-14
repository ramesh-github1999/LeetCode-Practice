class Solution {
         double dp[][][];
    int di[]={1,2,1,2,-1,-1,-2,-2};
    int dj[]={2,1,-2,-1,2,-2,1,-1};
    double fun(int i,int j,int k,int n){
        if(k<0 || i<0 || j<0 || j>=n || i>=n) return 0;
        if(k==0) return 1;
        if(dp[i][j][k]!=0) return dp[i][j][k];
        for (int m=0;m<8;m++){
            int ni=i+di[m];
            int nj=j+dj[m];
            dp[i][j][k]+=fun(ni,nj,k-1,n)/8.0;
        }
        return dp[i][j][k];
    }
    public double knightProbability(int n, int k, int row, int column) {
       dp= new double[n][n][k+1];
       return fun(row,column,k,n);
    }
}