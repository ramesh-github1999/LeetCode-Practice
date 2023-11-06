class Solution {
    int [][]dp=new int[50][50];
   
    int fun(int [] values,int i,int j){
         if(i+1==j) return 0;
         int res=Integer.MAX_VALUE;
        if (dp[i][j]!=0) return dp[i][j];
        for (int k = i+1; k < j; k++) {
            res=Math.min(res,fun(values,i,k)+values[i]*values[j]*values[k]+fun(values,k,j));
        }
        return  dp[i][j]=res;
    }
    public int minScoreTriangulation(int[] values) {
       
        return fun(values,0,values.length-1);
    }
}