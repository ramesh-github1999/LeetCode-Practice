class Solution {
    public boolean checkPowersOfThree(int n) {
        while (n>0){
            if(n%3==0) n/=3;
            else {
                n--;
                if(n%3!=0) return false;
                n/=3;
            }
        }
        return true;
    }
}