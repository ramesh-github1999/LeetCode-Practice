class Solution {
public:
    bool check(vector<int>&v){
        for(int i=0;i<v.size();i++)
            if(v[i]!=i)return false;
        return true;
    }
    int reinitializePermutation(int n) {
        vector<int>v(n);
        for(int i=0;i<n;i++) v[i]=i;
        int cnt=0;
        while(true){
            vector<int>arr=v;
            for(int i=0;i<n;i++) if(i%2==0) arr[i]=v[i/2];
            else arr[i]=v[n/2+(i-1)/2];
            v=arr;
            cnt++;
            if(check(v)) return cnt;
        }
        return cnt;
    }
};