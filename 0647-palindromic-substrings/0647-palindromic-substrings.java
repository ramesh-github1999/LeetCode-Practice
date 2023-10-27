class Solution {
    
    public int countSubstrings(String s) {
       int n=s.length();
        int dp[][]=new int[n][n];
        
        int cnt=0;
       
       for (int j=0;j<n;j++) {
            for (int i = 0; i < n; i++) {
                int gap=j-i;
                if(gap<0) dp[i][j]=0;
                else if(gap==0) dp[i][j]=1;
                else if(gap==1){
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