class Solution {
    int fun(int n,int k){
     if(n==1 && k==1) return 0;
        int mid=(int)Math.pow(2,n-2); // pow(2,n-1)/2
        if(k<=mid) return fun(n-1,k);
        else return fun(n-1,k-mid)==0?1:0;
        
    }
    public int kthGrammar(int n, int k) {
        return fun(n,k);
    }
}

