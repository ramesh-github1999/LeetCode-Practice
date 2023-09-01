class Solution {
public:
    int cntBits(int n){
        int sum=0;
        while(n!=0){
            n&=n-1;
            sum++;   
        }
        return sum;
    }
    vector<int> countBits(int n) {
        vector<int>v(n+1);
        v[0]=0;
        for(int i=1;i<=n;i++){
            v[i]=cntBits(i);
        }
        return v;
    }
};