class Solution {
public:
    #define lli long long int
    bool judgeSquareSum(int c) {
        for(lli i=0;i*i<=c;i++){
            double b=sqrt(c-i*i);
            if(b==(int) b) return true;
        }
        return false;
    }
    
};