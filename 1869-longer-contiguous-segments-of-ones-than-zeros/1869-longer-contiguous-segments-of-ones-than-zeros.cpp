class Solution {
public:
    bool checkZeroOnes(string s) {
        int  Maxcnt0=0;
        int Maxcnt1=0;
        int cnt0=0,cnt1=0;
        for(auto it:s){
            if(it=='0'){
                cnt0++;
                Maxcnt0=max(Maxcnt0,cnt0);
                cnt1=0;
            }
            else{
                cnt1++;
                Maxcnt1=max(Maxcnt1,cnt1);
                cnt0=0;
            }
        }
        return Maxcnt1>Maxcnt0;
    }
};