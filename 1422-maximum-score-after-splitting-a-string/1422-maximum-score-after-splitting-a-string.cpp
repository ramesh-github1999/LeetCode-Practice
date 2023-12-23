class Solution {
public:
    int maxScore(string s) {
        int n=s.length();
       int one=0,zero=0;
        int maxi=0;
        for(int i=0;i<n;i++) if(s[i]=='1') one++;
        for(int i=0;i<n-1;i++){
            if(s[i]=='1') one--;
            else zero++;
            maxi=max(maxi,one+zero);
        }
        
        return maxi;
        
    }
};