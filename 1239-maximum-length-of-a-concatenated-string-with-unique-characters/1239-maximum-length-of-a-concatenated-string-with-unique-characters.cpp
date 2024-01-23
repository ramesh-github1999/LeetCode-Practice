class Solution {
public:
  bool isUnique(string s1, string s2){
        int a[26] = {0};
        for(int  i = 0; i<s2.size(); i++){
            if(a[s2[i]-'a'] > 0) return false;
            a[s2[i]-'a']++;
        }
        for(int i = 0; i<s1.size(); i++){
            if(a[s1[i]-'a'] > 0) return false;
        }
        return true;
    }
    int solve(vector<string>& arr,int index,int n,string s){
        if(index>=n) return s.size();
        int include=0;
        int exclude=solve(arr,index+1,n,s);
        if(isUnique(s,arr[index])){
            include = solve(arr,index+1,n,s+arr[index]);  
        }
        else{
            int k=s.length();
            exclude=max(k,exclude);
        }
        
        return max(include,exclude);
    }
    
    int maxLength(vector<string>& arr) {
        string s = "";
        return solve(arr,0,arr.size(),s);
    }
};