class Solution {
public:
    int maxScore(string s) {
        int n=s.length();
        vector<int>zero(n,0);
        vector<int>one(n,0);
        for(int i=0;i<n;i++){
            if(i==0){
                if(s[i]=='0') zero[i]=1;
            }
            else if(s[i]=='0') zero[i]=zero[i-1]+1;
            else zero[i]=zero[i-1];
        }
        
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                if(s[i]=='1') one[i]=1;
            }
            else if(s[i]=='1') one[i]=one[i+1]+1;
            else one[i]=one[i+1];
        }
        int maxi=0;
        for(int i=0;i<=n-2;i++){
            maxi=max(maxi,zero[i]+one[i+1]);
        }
        return maxi;
        
    }
};