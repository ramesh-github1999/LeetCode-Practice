class Solution {
    static boolean anagram(int a[],int b[]){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int a[]=new int[26];
        int b[]=new int[26];
        int j=0;
        while(j<s1.length()){
            a[s1.charAt(j)-'a']++;
            b[s2.charAt(j)-'a']++;
            j++;
        }
        if(anagram(a,b)) return true;
        int i=0;
        while(j<s2.length()){
            b[s2.charAt(j)-'a']++;
            b[s2.charAt(i)-'a']--;
            if(anagram(a,b)) return true;
            i++;
            j++;
        }
        return false;

    }
}