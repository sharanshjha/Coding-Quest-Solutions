//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long N = sc.nextLong();

            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for (long num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> result = new ArrayList<>();
        
        long fact = 1; // Initial factorial (0! or 1!)
        long i = 1;    // Factorial index (1!)

        // Compute factorials and add them to the list
        while (fact <= n) {
            result.add(fact);
            
            // Calculate the next factorial
            i++;
            fact *= i;
        }
        
        return result;
    }

    public static void main(String[] args) {
        long n = 120;
        ArrayList<Long> factorials = factorialNumbers(n);
        System.out.println(factorials); // Output: [1, 2, 6, 24, 120]
    }
}
