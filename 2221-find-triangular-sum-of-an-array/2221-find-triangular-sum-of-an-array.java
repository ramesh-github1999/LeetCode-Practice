class Solution {
    public int triangularSum(int[] nums) {
         int n=nums.length;
        int []row;
        int[]prev=nums;
        for (int i=1;i<n;i++){
            row=new int[n-i];
            int k=0;
            for(int j=0;j<n-i;j++){
                row[k++]=(prev[j]+prev[j+1])%10;
            }
            prev=row;
            
        }
        return prev[0];
    }
}