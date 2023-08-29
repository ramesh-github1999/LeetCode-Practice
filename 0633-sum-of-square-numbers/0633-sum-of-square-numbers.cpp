class Solution {
public:
    #define lli long long int
    bool judgeSquareSum(int c) {
        for(lli i=0;i*i<=c;i++){
            lli rem=c-(i*i);
            if(binarySearch(0,rem,rem)) return true;
        }
        return false;
    }
    bool binarySearch(lli l, lli h,lli rem){
        while(l<=h){
            lli mid=l+(h-l)/2;
            if(mid*mid==rem) return true;
            if(mid*mid>rem) h=mid-1;
            else l=mid+1;
        }
        return false;
    }
      /*  lli l=0;
        lli h=sqrt(c);
        if(h*h==c) return true;
        while(l<=h){
            lli mid=l+(h-l)/2;
            lli k=l*l;
            lli rem=c-k;
            lli sqrtRem=sqrt(rem);
            lli sqrtRemSq=sqrtRem*sqrtRem;
            if(sqrtRemSq==rem) return true;
            else if(sqrtRemSq>rem) h=mid-1;
            else l=mid+1;
        }
        return false;*/
    
};