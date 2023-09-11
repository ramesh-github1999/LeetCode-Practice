class Solution {
    public boolean checkbits(int x,int i){
    return (x&(1<<i))!=0;

}
    public int singleNumber(int[] A) {
      int ans=0;
    for(int i=0;i<32;i++){
        int cnt=0;
        for(int j=0;j<A.length;j++){
        if(checkbits(A[j],i)) cnt++;
        }
        if(cnt%3==1) ans=ans|(1<<i);
    }
    return ans;
}

}