//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            int ans = obj.dataTypeSize(s);
            String Character = "Character";
            if (Character.equals(s) && ans == 2) {
                ans = 1;
            }
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java


class Solution {
    static int dataTypeSize(String data_type) {
        // Return the size in bytes based on the data type
        if (data_type.equals("Character")) {
            return 2;  // For Java, Character is typically 2 bytes
        } else if (data_type.equals("Integer")) {
            return 4;  // Integer is 4 bytes
        } else if (data_type.equals("Long")) {
            return 8;  // Long is 8 bytes
        } else if (data_type.equals("Float")) {
            return 4;  // Float is 4 bytes
        } else if (data_type.equals("Double")) {
            return 8;  // Double is 8 bytes
        } else {
            return -1;  // Return -1 for invalid data type
        }
    }
}