class Solution {
    public int maxScore(int[] A, int B) {
         int n=A.length;
       int psum=0;// prefix sum
       int ssum=0;
       
       for(int i=n-1;i>=n-B;i--) ssum+=A[i]; // B selection from end 0 selection from start
       int maxi=ssum;
       for(int i=0;i<B;i++){
           psum+=A[i];
           ssum-=A[n-(B-i)];
           maxi=Math.max(ssum+psum, maxi);
       }

       return maxi;
    }
}