class Solution {
public:
    int titleToNumber(string c) {
        int l=c.length();
        int p=l;
        p--;
        int ans=0;
        for(int i=0;i<l;i++){
            int k=c[i]-'A'+1;
         //   cout<<k<<" "<<p<<endl;
            ans=ans+(k*pow(26,p));
            p--;
        }
        return ans;
    }
};