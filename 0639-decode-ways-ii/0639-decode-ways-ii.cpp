class Solution {
public:
    int numDecodings(string s) {
        int mod=pow(10,9)+7;
        int n=s.length();
        vector<long long int>dp(n,0);
        if(s[0]=='0') return 0;
        if(s[0]=='*') dp[0]=9;
        else dp[0]=1;
        for(int i=1;i<n;i++){
             if(s[i-1]=='0' && s[i]=='0') return 0;
            if(s[i]!='*' && s[i-1]!='*'){
                
                if(s[i]!='0' && s[i-1]!='0'){
                string str=s.substr(i-1,2);
                int k=stoi(str);
                if(k<=26 ){
                   if(i>=2) dp[i]=(dp[i-1]%mod +dp[i-2]%mod)%mod;
                    else dp[i]=(dp[i-1]%mod+1)%mod;
                } 
                else dp[i]=dp[i-1]%mod;
                }
                
                else if(s[i]=='0') {
                     if(s[i-1]=='1' || s[i-1]=='2'){
                        if(i>=2) dp[i]=dp[i-2]%mod;
                        else dp[i]=1;
                   }
                    else return 0;
                }
                else if(s[i-1]=='0') dp[i]=dp[i-1]%mod;
                
            }
            
            else if(s[i-1]!='*' && s[i]=='*'){
                dp[i]=(dp[i-1]%mod*9)%mod;
                if(s[i-1]=='1') {
                    if(i>=2) dp[i]=(dp[i]%mod+(dp[i-2]%mod*9)%mod)%mod;
                    else dp[i]=(dp[i]%mod+9)%mod;
                  }
                else if(s[i-1]=='2'){
                    if(i>=2) dp[i]=(dp[i]%mod+(dp[i-2]%mod*6)%mod)%mod;
                    else dp[i]=(dp[i]%mod+6)%mod;
                }
               }
            
            
            else if(s[i-1]=='*' && s[i]!='*'){
                if(s[i]!='0')
                 dp[i]=dp[i-1]%mod;
                if(s[i]!='7' && s[i]!='8' && s[i]!='9') {
                    if(i>=2) dp[i]=(dp[i]%mod+(2*dp[i-2]%mod)%mod)%mod;
                    else dp[i]=(dp[i]%mod+2)%mod;
                   // dp[i]+=i>=2? 2*dp[i-2]:2;
                }
                else {
                     if(i>=2) dp[i]=(dp[i]%mod+dp[i-2]%mod)%mod;
                    else dp[i]=(dp[i]%mod+1)%mod;
                    // dp[i]+=i>=2? dp[i-2]:1;
                }
            }
                
            else{
                dp[i]=(9*dp[i-1]%mod)%mod;
                if(i>=2){
                    dp[i]=(dp[i]%mod+(15*dp[i-2]%mod)%mod)%mod;
              //  dp[i]+=dp[i-2]*15;
                }
                else dp[i]=(dp[i]%mod+15)%mod;
                
            }
        }
        
        return dp[n-1]%mod;
    }
};


/*
"21213332221114442"
"22222222*"
"222222233333*"
"2*2"
"2*7"
"2*2*"
"2*2*6"
"2*2*7"

*/