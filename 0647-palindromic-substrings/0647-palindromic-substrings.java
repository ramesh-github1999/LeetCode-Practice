class Solution {
    
    public int countSubstrings(String s) {
      int n=s.length();
        int dp[][]=new int[n][n];
        int cnt=0;

        for (int g=0;g<n;g++) {
            for (int i = 0,j=i+g; j< n; i++,j++) {
                if(g==0) dp[i][j]=1;
                else if(g==1){
                    if(s.charAt(i)==s.charAt(j)) dp[i][j]=1;
                    else dp[i][j]=0;
                }
                else{
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==1) dp[i][j]=1;
                    else dp[i][j]=0;
                }
                if(dp[i][j]==1) cnt++;

            }
        }
        return cnt;
    }
}