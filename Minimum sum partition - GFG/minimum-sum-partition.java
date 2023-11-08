//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int A[] = new int[n];
                    for(int i = 0;i<n;i++)
                        A[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minDifference(A,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{

	public int minDifference(int nums[], int n) 
	{ 
	    // Your code goes here
	   // int n=nums.length;
        int sum=0;
        for(int it:nums) sum+=it;
        int m=sum;
        boolean t[][]=new boolean[n+1][m+1];
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=m; j++) {
                if(j==0) t[i][j]=true;
                else if(i==0) t[i][j]=false;
                else if(nums[i-1]<=j) t[i][j]=t[i-1][j] || t[i-1][j-nums[i-1]];
                else t[i][j]=t[i-1][j];
            }
        }
        for(int j=sum/2;j>=0;j--){
            if(t[n][j]) return sum-2*j;
        }
        return 0;
	} 
}
