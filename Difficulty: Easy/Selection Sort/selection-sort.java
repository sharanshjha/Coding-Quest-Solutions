//{ Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n]; 
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
		
			Solution obj = new Solution();
			obj.selectionSort(arr, n);
			
			for(int i=0;i<n;i++)
		    	System.out.print(arr[i]+" ");
		    System.out.println();
			t--;
		}
		
	}
}

// } Driver Code Ends

class Solution
{
    // Function to select the index of the smallest element in the unsorted part
    int select(int arr[], int i)
    {
        int mini = i;
        for(int j = i + 1; j < arr.length; j++) {
            if(arr[j] < arr[mini]) {
                mini = j;
            }
        }
        return mini;
    }
    
    // Function to perform selection sort
    void selectionSort(int arr[], int n)
    {
        for(int i = 0; i < n - 1; i++) {
            // Find the index of the minimum element in the unsorted part
            int mini = select(arr, i);
            
            // Swap the found minimum element with the first element
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
    }
}
