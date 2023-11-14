class Solution {
    public int longestPalindrome(String s) {
         int count[]=new int[128];
        for (int i=0;i<s.length();i++){
            count[s.charAt(i)-'A']++;
        }
        int ans=0;
        int extra=0;
        for (int i=0;i<128;i++){
            if(count[i]>0){
                if(count[i]%2==0) ans+=count[i];
                else {
                    extra++;
                    ans+=count[i]-1;
                }
            }
        }
        if(extra>0) ans++;
        return ans;

    }
}