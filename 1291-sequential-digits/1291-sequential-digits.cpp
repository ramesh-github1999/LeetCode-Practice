class Solution {
public:
    vector<int>v;
    void fun(int k,int low, int high){
       // cout<<k<<endl;
        if(k>high) return;
        if(k>=low && k<=high) {
            v.push_back(k);
           // return ;
        }
                
        int last=k%10;
        int prev=last;
        last++;
        k= k*10+last;
        if(last/10!=0) return;
        fun(k,low,high);
        
    }
    vector<int> sequentialDigits(int low, int high) {
        for(int i=1;i<=9;i++)
            fun(i,low,high);
       sort(v.begin(),v.end());
        return v;
    }
};