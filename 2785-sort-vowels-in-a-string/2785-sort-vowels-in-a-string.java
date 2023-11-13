class Solution {
    public String sortVowels(String s) {
         String t="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'||s.charAt(i)=='E' || s.charAt(i)=='I'||s.charAt(i)=='O' || s.charAt(i)=='U'||s.charAt(i)=='a' || s.charAt(i)=='e'||s.charAt(i)=='i' || s.charAt(i)=='o'||s.charAt(i)=='u')
                t+=s.charAt(i);
        }
        char [] chart=t.toCharArray();
        Arrays.sort(chart);
        int k=0;
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'||s.charAt(i)=='E' || s.charAt(i)=='I'||s.charAt(i)=='O' || s.charAt(i)=='U'||s.charAt(i)=='a' || s.charAt(i)=='e'||s.charAt(i)=='i' || s.charAt(i)=='o'||s.charAt(i)=='u'){
                 ans.append(chart[k]);
            k++;
            }
        else ans.append(s.charAt(i));

        }
        return ans.toString();

    }
}