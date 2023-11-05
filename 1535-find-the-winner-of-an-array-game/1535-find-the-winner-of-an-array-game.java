class Solution {
    public int getWinner(int[] arr, int k) {
         int n=arr.length;
        int maxi=0;
        if(k>=n-1) {
            for (int i = 0; i < n; i++) {
                maxi=Math.max(maxi,arr[i]);
            }
            return maxi;
        }
        int cnt=0;
         maxi=arr[0];
        for (int i = 1; i < n; i++) {
            if(arr[i]>maxi){
                maxi=arr[i];
                cnt=0;
            }
            cnt++;
            if (cnt==k) return maxi;

        }
        return maxi;
    }
}