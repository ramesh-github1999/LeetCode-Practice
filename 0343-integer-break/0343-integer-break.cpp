class Solution {
public:
    int integerBreak(int n) {
        int maxi=0;
        for(int i=2;i<=n;i++){
            int q=n/i;
            int r=n%i;
            int ans=1;
            int cnt=0;
            while(cnt<i-r){
                ans*=q;
                cnt++;
            }
            while(cnt<i){
                ans*=(q+1);
                cnt++;
            }
            maxi=max(ans,maxi);
        }
        return maxi;
        
    }
};