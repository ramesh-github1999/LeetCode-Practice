class Solution {
    int maxi(int []arr,int i,int j){
        int maxm=0;
        for (int k = i; k <=j; k++) {
            maxm=Math.max(maxm,arr[k]);
        }
        return maxm;
    }
    int fun(int [] arr,int i,int j,int [][]dp){
        if(i==j) return 0;
        if (dp[i][j]!=0) return dp[i][j];
        int res=Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
              res=Math.min(res,maxi(arr,i,k)*maxi(arr,k+1,j)+fun(arr,i,k,dp)+fun(arr,k+1,j,dp));
        }
        return dp[i][j]=res;
    }
    public int mctFromLeafValues(int[] arr) {
        int n=arr.length;
        int dp[][]=new int[n][n];
        return  fun(arr,0,n-1,dp);

    }
}