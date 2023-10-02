//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
         int n = s.length();
        Map<Character, Integer> mp = new HashMap<>();
        int i = 0, j = 0;
        int ans = -1;
        while (j < n) {
            mp.put(s.charAt(j), mp.getOrDefault(s.charAt(j), 0) + 1);
            if(mp.size()<k) {
                j++;
                continue;
            }
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