class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int i=0,j=0;
        int maxfreq=0;
        Map<Character,Integer>mp=new HashMap<>();
        int ans=0;

        while(j<n){
            mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1);
          //  freq[s.charAt(j)-'A']++;
            maxfreq=Math.max(mp.get(s.charAt(j)),maxfreq);
            while(j-i+1-maxfreq>k){
              //  freq[s.charAt(i)-'A']--;
                 mp.put(s.charAt(i),mp.get(s.charAt(i))-1);
                i++;
            }
            ans=Math.max(j-i+1,ans);
            j++;
        }
        return ans;
    }
}
