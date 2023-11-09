class Solution {
    public int countHomogenous(String s) {
         int n=s.length();
        int i=0;
        long ans=0;
        int mod=(int)Math.pow(10,9)+7;
        while(i<n){
            int j=i;
            while(j<n && s.charAt(i)==s.charAt(j)){
                j++;
            }
            long len=j-i;
            i=j;
            ans+=(((len)%mod*(len+1)%mod)%mod)/2;

        }
        return (int)ans;
    }
}