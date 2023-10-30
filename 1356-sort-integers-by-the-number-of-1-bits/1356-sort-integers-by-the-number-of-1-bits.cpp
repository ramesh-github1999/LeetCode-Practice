class Solution {
public:
    int static cntBits(int n){
        int cnt=0;
        while(n>0){
            if(n%2==1) cnt++;
            n/=2;
        }
        return cnt;
    }
    bool static comp(int a,int b){
        if(cntBits(a)==cntBits(b)) return a<=b;
        else return cntBits(a)<=cntBits(b);
    }
    vector<int> sortByBits(vector<int>& arr) {
        sort(arr.begin(),arr.end(),comp);
        return arr;
    }
};