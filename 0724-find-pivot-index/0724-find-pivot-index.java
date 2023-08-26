class Solution {
    public int pivotIndex(int[] A) {
         int n=A.length;
        long [] dp=new long[n];
        dp[0]=A[0];
        for(int i=1;i<n;i++){
        dp[i]=dp[i-1]+A[i];
      }
      for(int i=0;i<n;i++){
          if(i==0){
              if(dp[n-1]-dp[i]==0) return 0;
          }
          else{
              if(dp[i-1]==dp[n-1]-dp[i]) return i;
          }
      }
      return -1;
    }
}