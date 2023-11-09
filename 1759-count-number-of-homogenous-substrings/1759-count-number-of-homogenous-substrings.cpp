class Solution {
public:
    int countHomogenous(string s) {
        int n=s.length();
        int i=0;
        long long int ans=0;
        int mod=pow(10,9)+7;
       while(i<n){
           int j=i;
           while(s[i]==s[j]){
               j++;
           }
          long long int len=j-i;
           i=j;
           ans+=(((len)%mod*(len+1)%mod)%mod)/2;
          
       }
        return ans;
       
    }
};