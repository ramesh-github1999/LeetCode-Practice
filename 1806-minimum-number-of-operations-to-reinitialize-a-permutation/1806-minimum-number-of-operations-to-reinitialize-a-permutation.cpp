class Solution {
public:
    int reinitializePermutation(int n) {
        int cnt=0,i=1;
        while(cnt==0|| i>1){
           i=(i*2)%(n-1);
            cnt++;
        }
        return cnt;
    }
};