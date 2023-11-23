class Solution {
public:
    vector<bool> checkArithmeticSubarrays(vector<int>& nums, vector<int>& l, vector<int>& r) {
        int n=l.size();
        vector<bool>ans;
        for(int i=0;i<n;i++){
            vector<int>v;
            for(int j=l[i];j<=r[i];j++)
                v.push_back(nums[j]);
            sort(v.begin(),v.end());
           int m=v.size();
          //  cout<<m<<endl;
            if(m==1) ans.push_back(true);
            else{
                int d=v[1]-v[0];
                bool flag=true;
                for(int k=2;k<m;k++){
                    if(v[k]-v[k-1]!=d) {
                        flag=false;
                        ans.push_back(false);
                        break;
                    }
                   
                }
                if(flag) ans.push_back(true);
               
            }
        }
        return ans;
    }
};