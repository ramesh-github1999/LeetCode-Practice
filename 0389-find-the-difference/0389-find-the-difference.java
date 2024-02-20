class Solution {
    public char findTheDifference(String s, String t) {
         int k=0;
        for(int i=0;i<s.length();i++){
            k^=(s.charAt(i)-'a');
        }
        for(int i=0;i<t.length();i++){
            k^=(t.charAt(i)-'a');
        }
        return (char)(k+'a');
    }
}