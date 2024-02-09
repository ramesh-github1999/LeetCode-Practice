class Solution {
public:
    int numSquares(int n) {
        vector<int>dp(n+1);
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=i;
            int k=sqrt(i);
            if(k*k==i) {dp[i]=1; continue;}
            int l=1;
            int r=i-1;
            while(l<=i/2){
                dp[i]=min(dp[i],dp[l++]+dp[r--]);
            }
            
        }
        
      return dp[n];
        
        
    }
    
    
};