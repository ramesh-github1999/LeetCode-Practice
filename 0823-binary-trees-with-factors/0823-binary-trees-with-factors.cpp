class Solution {
public:
    #define lli long long int
    int numFactoredBinaryTrees(vector<int>& arr) {
        sort(arr.begin(),arr.end());
        map<lli,lli>mp;
        int n=arr.size();
        int mod=pow(10,9)+7;
        for(int i=0;i<n;i++) mp[arr[i]]++;
        for(int i=0;i<n;i++){
            int key=arr[i];
            for(int j=0;j<i;j++){
                if(key%arr[j]==0 && mp.find(key/arr[j])!=mp.end()){
                    int first=key/arr[j];
                    int second=key/first;
                        if(mp.find(second)!=mp.end()){
                            lli keyAns=(mp[first]%mod*mp[second]%mod)%mod;
                            mp[key]=(mp[key]%mod+keyAns%mod)%mod;
                        }
                    }
                }
            }
        lli sum=0;
        for(auto it:mp) sum=(sum%mod+it.second%mod)%mod;
        return sum;
        
    }
};


