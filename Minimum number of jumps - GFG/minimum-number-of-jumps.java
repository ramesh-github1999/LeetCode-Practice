//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}

// } Driver Code Ends


class Solution{
    static int minJumps(int[] arr){
        // your code here
        if(arr[0]==0) return -1;
        int curr_max=0,curr_end=0;
        int cnt=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            curr_max=Math.max(curr_max,i+arr[i]);
            if(i==curr_end){
                cnt++;
                curr_end=curr_max;
            }
            if(curr_end>=n-1) return cnt;
        }
        return -1;
    }
}