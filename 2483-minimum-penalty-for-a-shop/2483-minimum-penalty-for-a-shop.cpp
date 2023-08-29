class Solution {
public:
    int bestClosingTime(string s) {
        int n=s.length();
        vector<int>Y(n+1);
        vector<int>N(n+1);
         Y[n]=0;
        for(int i=n-1;i>=0;i--){
            if(s[i]=='Y'){
                Y[i]=Y[i+1]+1;
            }
            else Y[i]=Y[i+1];
        }
        N[0]=0;
        for(int i=1;i<=n;i++){
            if(s[i-1]=='N') N[i]=N[i-1]+1;
            else N[i]=N[i-1];
        }
        
      //  for(int i=0;i<=n;i++) cout<<N[i]<<" ";
        int mini=INT_MAX;
        int ans=-1;
        for(int i=0;i<=n;i++){
            if(mini>Y[i]+N[i]){
                mini=Y[i]+N[i];
                ans=i;
            }
        }
        return ans;
        
    }
};