class Solution {
public:
    int numDecodings(string s) {
        int n=s.length();
        vector<int>dp(n,0);
        if(s[0]=='0') return 0;
        dp[0]=1;
        for(int i=1;i<n;i++){
            if(s[i-1]=='0' && s[i]=='0') return 0;
            else if(s[i]=='0'){
                if(s[i-1]=='1' || s[i-1]=='2'){
                    if(i>=2) dp[i]=dp[i-2];
                    else dp[i]=1;
                }
                else return 0;
            }
            else if(s[i-1]=='0'){
                dp[i]=dp[i-1];
            }
            else{
                string str=s.substr(i-1,2);
                int k=stoi(str);
                if(k<=26 ){
                   if(i>=2) dp[i]=dp[i-1] +dp[i-2];
                    else dp[i]=dp[i-1]+1;
                } 
                else dp[i]=dp[i-1];
            }
            
        }
     return dp[n-1];   
    }
};