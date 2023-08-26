class Solution {
    public int maxScore(int[] A, int B) {
         int n=A.length;
       int psum[]=new int[n]; // prefix sum
       int ssum[]=new int[n];
       psum[0]=A[0];
       for(int i=1;i<n;i++) psum[i]=psum[i-1]+A[i];

       ssum[n-1]=A[n-1];
       for(int i=n-2;i>=0;i--) ssum[i]=ssum[i+1]+A[i];

       int maxi=Math.max(psum[B-1],ssum[n-B]); // zero selection from end and zero selection from start

       for(int i=1;i<B;i++){
           maxi=Math.max(maxi,psum[i-1]+ssum[n-(B-i)]);
       }
       return maxi;
    }
}