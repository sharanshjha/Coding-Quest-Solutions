//{ Driver Code Starts
import java.util.*;
class Sorting
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    // Driver program
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			
			new Solution().quickSort(arr,0,n-1);
			printArray(arr);
		    T--;
		}
} }
// } Driver Code Ends

class Solution
{
    // Function to sort an array using Quick Sort algorithm
    static void quickSort(int arr[], int low, int high)
    {
        if(low < high){
            // Partition the array and get the pivot index
            int pIndex = partition(arr, low, high);

            // Recursively sort the two halves
            quickSort(arr, low, pIndex - 1); // Left of pivot
            quickSort(arr, pIndex + 1, high); // Right of pivot
        }
    }

    // Partition function to place the pivot in the correct position
    static int partition(int arr[], int low, int high)
    {
        int pivot = arr[low]; // Taking the first element as pivot
        int i = low;
        int j = high;

        // Re-arranging the array based on pivot
        while(i < j) {
            // Find element greater than pivot
            while(arr[i] <= pivot && i < high) {
                i++;
            }

            // Find element smaller than or equal to pivot
            while(arr[j] > pivot && j > low) {
                j--;
            }

            // Swap if i and j haven't crossed yet
            if(i < j) {
                swap(arr, i, j);
            }
        }

        // Finally, swap the pivot element with the j-th element
        swap(arr, low, j);
        return j; // Return the pivot index
    }

    // Function to swap two elements in the array
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
