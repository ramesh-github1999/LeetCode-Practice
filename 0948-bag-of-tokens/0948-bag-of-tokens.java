class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int n=tokens.length;
        int i=0;
        int j=n-1;
        int score=0;
        int currScore=0;
        Arrays.sort(tokens);
        while (i<=j){
            if(tokens[i]>power && score==0) return score;
            while(i<n && tokens[i]<=power){
                power-=tokens[i];
                currScore++;
                i++;

            }
            score=Math.max(score,currScore);
            if(currScore>0){
                power+=tokens[j];
                 j--;
                currScore--;
            }
           // score=Math.max(score,currScore);
        }
        return score;
    }
}