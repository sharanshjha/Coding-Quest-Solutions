//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.sumOfSeries(N));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    long sumOfSeries(long n) {
        // code here
          long sum = 0;

        // If n == 0, return 0 (assuming you want to return a long)
        if(n == 0) return 0;

        long i = n; // Use long to avoid type mismatch
        sum = sum + (long) Math.pow(i, 3); // Cast Math.pow to long

        i++;
   
        return sum + sumOfSeries(n-1);
       
    }
   
}