class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
         String[] word1=sentence1.split(" ");
        String []word2=sentence2.split(" ");
        int n1=word1.length;
        int n2=word2.length;
        if(n1>n2) return areSentencesSimilar(sentence2,sentence1);
        int i=0;
        while (i<n1 && word1[i].equals(word2[i])) i++;
        while (i<n1 && word1[i].equals(word2[n2-n1+i])) i++;
        return i==n1;
    }
}