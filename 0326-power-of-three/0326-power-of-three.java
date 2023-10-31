class Solution {
    public boolean isPowerOfThree(int n) {
        
        if(n<=0) return false;
        return  ((int)Math.pow(3,19))%n==0;
    }
}