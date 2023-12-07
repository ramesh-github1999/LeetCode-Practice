class Solution {
public:
    int totalMoney(int n) {
        int k=n/7;
        int m=k;
        if(k==0) return (n*(n+1))/2; 
        int f=28;
        int l=28+(k-1)*7;
        int sum=(k*(f+l))/2; 
        
        int rem=n%7;
        for(int i=m+1;i<=m+rem;i++) sum+=i;
        return sum;
    }
};