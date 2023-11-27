class Solution {
public:
    int m=pow(10,9)+7;
    int mod(int a,int b){
        return (a%m+b%m)%m;
    }
    int mod(int a,int b,int c){
        return ((a%m+b%m)%m+c%m)%m;
    }
    int knightDialer(int n) {
        if(n==1) return 10;
        int dp[n+1][10];
        for(int i=0;i<=n;i++){
            for(int j=0;j<10;j++){
                if(i==0) dp[i][j]=0;
                else if(i==1) dp[i][j]=1;
                else{
                    if(j==0) dp[i][j]=mod(dp[i-1][4],dp[i-1][6]);
                    if(j==1) dp[i][j]=mod(dp[i-1][6],dp[i-1][8]);
                    if(j==2) dp[i][j]=mod(dp[i-1][7],dp[i-1][9]);
                    if(j==3) dp[i][j]=mod(dp[i-1][4],dp[i-1][8]);
                    if(j==4) dp[i][j]=mod(dp[i-1][0],dp[i-1][3],dp[i-1][9]);
                    if(j==5) dp[i][j]=0;
                    if(j==6) dp[i][j]=mod(dp[i-1][0],dp[i-1][1],dp[i-1][7]);
                    if(j==7) dp[i][j]=mod(dp[i-1][2],dp[i-1][6]);
                    if(j==8) dp[i][j]=mod(dp[i-1][1],dp[i-1][3]);
                    if(j==9) dp[i][j]=mod(dp[i-1][2],dp[i-1][4]);
                    
                }
            }
        }
      //  for(int i=0;i<n;i++)
        int sum=0;
        for(int j=0;j<10;j++) sum=(sum%m+dp[n][j]%m)%m;
        return sum;
    }
};