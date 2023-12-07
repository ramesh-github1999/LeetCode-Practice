class Solution {
public:
    int totalMoney(int n) {
        int k=n/7;
        int m=k;
        if(k==0) return (n*(n+1))/2; 
        int sum=28;
        int csum=28;
         
        while(k>1){
            csum+=7;
            sum+=csum;
            k--;
        }
        
        int rem=n%7;
        for(int i=m+1;i<=m+rem;i++) sum+=i;
        return sum;
    }
};