class Solution {
    public int countPalindromicSubsequence(String s) {
         int n = s.length();
        int []first=new int[26];
        int [] last=new int[26];
        Arrays.fill(first,-1);
        Arrays.fill(last,-1);

        for (int i = 0; i < n; i++) {
            if (first[s.charAt(i)-'a'] == -1) first[s.charAt(i)-'a'] = i;
            else last[s.charAt(i)- 'a']= i;
        }
        int ans = 0;
        for (int i = 0; i < 26; i++) {
            if (last[i] !=-1) {
                Set<Character> st=new HashSet<>();
                for (int j = first[i] + 1; j < last[i];j++)
                      st.add(s.charAt(j));
                ans += st.size();
            }
        }
        return ans;
    }
}