class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int n = s.length();
        Map<Character, Integer> mp = new HashMap<>();
        int i = 0, j = 0;
        int ans = 0;
        while (j < n) {
            mp.put(s.charAt(j), mp.getOrDefault(s.charAt(j), 0) + 1);
            while (mp.size() > k) {
                mp.put(s.charAt(i), mp.get(s.charAt(i)) - 1);
                if (mp.get(s.charAt(i)) == 0) mp.remove(s.charAt(i));
                i++;
            }
            ans = Math.max(j - i + 1, ans);
            j++;

        }
        return ans;
    }
}