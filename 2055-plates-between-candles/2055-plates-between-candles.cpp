class Solution {
public:
  /*  int fun(int left,int right,string s){
        int cnt=0;
        for(int i=left;i<=right;i++)
            if(s[i]=='*') cnt++;
        return cnt;
    }*/
    vector<int> platesBetweenCandles(string s, vector<vector<int>>& queries) {
        int n=s.length();
        vector<int>l(n);
        if(l[0]=='|') l[0]=0;
        else l[0]=-1;
        for(int i=1;i<n;i++){
            if(s[i]=='|') l[i]=i;
            else l[i]=l[i-1];
        }
        // 0 1 1
        vector<int>r(n);
       if(s[n-1]=='|') r[n-1]=n-1;
        else r[n-1]=n-1;
        for(int i=n-2;i>=0;i--){
            if(s[i]=='|') r[i]=i;
            else r[i]=r[i+1];
        }
        // 0 1 -1
        vector<int>cnt(n,0);
        if(s[0]=='*') cnt[0]=1;
        for(int i=1;i<n;i++){
            if(s[i]=='*') cnt[i]=cnt[i-1]+1;
            else cnt[i]=cnt[i-1];
        }
        int len=queries.size();
        vector<int>ans(len);
        for(int i=0;i<len;i++){
            int left=r[queries[i][0]];
            int right=l[queries[i][1]];
            if(left<right) {
                if(left==0) ans[i]=cnt[right];
                else ans[i]=cnt[right]-cnt[left-1];
            }
            else ans[i]=0;
        }
        return ans;
    }
};