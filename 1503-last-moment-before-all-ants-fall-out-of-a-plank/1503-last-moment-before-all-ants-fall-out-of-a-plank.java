class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int maxi=0;
        for (int i = 0; i < left.length; i++) {
            maxi=Math.max(left[i]-0,maxi);
        }
        for (int i = 0; i < right.length; i++) {
            maxi=Math.max(n-right[i],maxi);
        }
        return maxi;    }
}