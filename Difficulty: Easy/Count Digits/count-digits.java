//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));
        }
    }
}
// } Driver Code Ends




//User function Template for Java


class Solution{
    static int evenlyDivides(int n){
        // code here
        int count = 0;
        int temp = n;
        
        // Handle edge case where number is zero
        if (n == 0) {
            return 0; // Zero cannot be divided by any digit
        }
        
        // Iterate through each digit of n
        while (temp > 0) {
            int digit = temp % 10; // Get the last digit
            temp = temp / 10; // Remove the last digit
            
            // Check if the digit is non-zero and divides n
            if (digit != 0 && n % digit == 0) {
                count++;
            }
        }
        
        return count;
    }
}