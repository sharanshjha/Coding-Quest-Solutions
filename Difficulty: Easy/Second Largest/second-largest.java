//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.print2largest(arr);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(print2largest(arr));
    }

    public static int print2largest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        
        for (int i : arr) {
            if (i > first) {
                second = first;
                first = i;
            } else if (i > second && i < first) {
                second = i;
            }
        }
        
        return second == Integer.MIN_VALUE ? -1 : second;
    }
}
