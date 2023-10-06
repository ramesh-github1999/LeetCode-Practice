
class Solution {
   public static boolean anagram(int a[],int b[]){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
         List<Integer>l=new ArrayList<>();
        String s1=p;
        String s2=s;
       if(s1.length()>s2.length()) return l;
        int a[]=new int[26];
        int b[]=new int[26];
        int j=0;
        while(j<s1.length()){
            a[s1.charAt(j)-'a']++;
            b[s2.charAt(j)-'a']++;
            j++;
        }
        if(anagram(a,b)) l.add(0);
        int i=0;
        while(j<s2.length()){
            b[s2.charAt(j)-'a']++;
            b[s2.charAt(i)-'a']--;
            if(anagram(a,b)) l.add(i+1);
            i++;
            j++;
        }
        return l;
    }
}