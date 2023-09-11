class Solution {
public:
    vector<int> singleNumber(vector<int>& A) {
        int totalxor=0;
    int n=A.size();
    for(int i=0;i<n;i++) totalxor=totalxor^A[i];
    // find any set bit in totalxor
    int b=-1;
    for(int i=0;i<32;i++){
        if((totalxor>>i)&1==1) {
            b=i; 
            break;
         }
    }
    int xor1=0,xor2=0;
    for(int i=0;i<n;i++){
        if((A[i]>>b)&1==1) xor1^=A[i];
        else xor2^=A[i];
    }
   
    return {xor2,xor1};
        
    }
};