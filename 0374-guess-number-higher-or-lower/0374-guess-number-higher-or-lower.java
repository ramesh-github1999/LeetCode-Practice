/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */
public class Solution extends GuessGame {
    int Binary(int n){
        int l=1,h=n;
        while(l<=h){
            int mid=l+(h-l)/2;
            int k=guess(mid);
            if(k==0) return mid;
            else if(k==1) l=mid+1;
            else h=mid-1;
        }
        return l;
    }
    public int guessNumber(int n) {
        return Binary(n);
    }
}