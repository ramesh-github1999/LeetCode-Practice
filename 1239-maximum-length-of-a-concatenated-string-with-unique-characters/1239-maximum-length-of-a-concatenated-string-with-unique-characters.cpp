class Solution {
public:
    int maxi=0;
    bool check (string s){
        unordered_map<char,int>mp;
        for(auto it:s) mp[it]++;
        return mp.size()==s.size();
    }
    void fun(vector<string>& arr, int i,string s){
        if(i==arr.size()){
            int k=s.length();
            maxi=max(k,maxi);
            return;
        }
        fun(arr,i+1,s);
        string t=s;
        t+=arr[i];
        if(check(t)) fun(arr,i+1,s+arr[i]);
        else {
            int k=s.length();
            maxi=max(k,maxi);
            return;
        }
        
    }
    int maxLength(vector<string>& arr) {
       // if(arr.size()==0) return arr[0].length();
        fun(arr,0,"");
        return maxi;
    }
};