class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int i=0,j=0;
        int maxfreq=0;
        int []freq=new int[26];
        int ans=0;
        while(j<n){
            freq[s.charAt(j)-'A']++;
            maxfreq=Math.max(freq[s.charAt(j)-'A'],maxfreq);
            while(j-i+1-maxfreq>k){
                freq[s.charAt(i)-'A']--;
                i++;
            }
            ans=Math.max(j-i+1,ans);
            j++;
        }
        return ans;
    }
}
