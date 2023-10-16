class Solution {
    public List<Integer> getRow(int rowIndex) {
          List<Integer>l=new ArrayList<>();
        if(rowIndex==0) {
            l.add(1);
            return l;
        }
        int [][] dp=new int [rowIndex+1][rowIndex+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp.length;j++) dp[i][j]=0;
        }
     //   Arrays.fill(dp,0);
        for(int i=0;i<=rowIndex;i++){
            for(int j=0;j<i+1;j++){
             if(j==0 || j==i) dp[i][j]=1;
             else dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
            }
        }
        for(int i=0;i<=rowIndex;i++){
           l.add(dp[rowIndex][i]);
        }
        return l;
    }
}