//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            Long A = Long.parseLong(S[0]);
            Long B = Long.parseLong(S[1]);

            Solution ob = new Solution();
            Long[] ptr = ob.lcmAndGcd(A,B);
            
            System.out.print(ptr[0]);
            System.out.print(" ");
            System.out.println(ptr[1]);
        }
    }
}
// } Driver Code Ends

class Solution {
    static Long[] lcmAndGcd(Long A, Long B) {
        // Function to calculate GCD using Euclidean Algorithm
        Long gcd = gcd(A, B);
        
        // Calculate LCM using the formula
        Long lcm = (A * B) / gcd;
        
        return new Long[] { lcm, gcd };
    }
    
    // Helper method to compute GCD
    private static Long gcd(Long a, Long b) {
        while (b != 0) {
            Long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static void main(String[] args) {
        Long A = 12L;
        Long B = 15L;
        Long[] result = lcmAndGcd(A, B);
        
        System.out.println("LCM: " + result[0]);
        System.out.println("GCD: " + result[1]);
    }
}
