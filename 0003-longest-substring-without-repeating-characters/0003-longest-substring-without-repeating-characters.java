class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int i=0,j=0;
        int maxi=0;
        Map<Character,Integer>mp=new HashMap<>();
        while(j<n){
            mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1);
            while(j-i+1>mp.size()){
                mp.put(s.charAt(i),mp.get(s.charAt(i))-1);
                if(mp.get(s.charAt(i))==0) mp.remove(s.charAt(i));
                i++;
            }
            maxi=Math.max(j-i+1,maxi);
            j++;
        }
        return maxi;
    }
}