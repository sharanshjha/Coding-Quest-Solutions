//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int choice = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            List<Double> arr = new ArrayList<Double>();
            for(int i = 0;i < choice;i++)
                arr.add(Double.parseDouble(a[i]));
            
            Solution ob = new Solution();
            if(choice == 1)
                System.out.println(String.format("%.2f", ob.switchCase(choice, arr)));
            else
                System.out.println((int)ob.switchCase(choice, arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java


class Solution {
    static double switchCase(int choice, List<Double> arr) {
        double area = 0.0;  // Initialize area variable

        // Switch based on the choice input
        switch (choice) {
            case 1:
                // Case for Circle: π * R^2
                double R = arr.get(0);
                area = Math.PI * R * R;
                break;

            case 2:
                // Case for Rectangle: L * B
                double L = arr.get(0);
                double B = arr.get(1);
                area = L * B;
                break;

            default:
                // Handle invalid choice (though not required by problem)
                area = -1;  // You could choose to return an error value if invalid choice
                break;
        }

        return area;  // Return the calculated area
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();  // Get the user's choice (1 for Circle, 2 for Rectangle)
        List<Double> arr = new ArrayList<>();

        if (choice == 1) {
            // Single value for Circle's radius
            arr.add(sc.nextDouble());  // Read the radius R
        } else if (choice == 2) {
            // Two values for Rectangle's length and breadth
            arr.add(sc.nextDouble());  // Read the length L
            arr.add(sc.nextDouble());  // Read the breadth B
        }

        // Create an object of Solution and call the method
        Solution obj = new Solution();
        double ans = obj.switchCase(choice, arr);  // Calculate the area
        System.out.println(ans);  // Output the result
    }
}
