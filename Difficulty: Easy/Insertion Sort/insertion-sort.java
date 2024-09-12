//{ Driver Code Starts
import java.util.*;
import java.lang.Math;

class Sorting
{
	
	static void printArray(int arr[],int size)
	{
		int i;
		for(i=0;i<size;i++)
		System.out.print(arr[i]+" ");
	    System.out.println();
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
		
			for(int i=0;i<n;i++)
			a[i]= sc.nextInt();
			
			 new Solution().insertionSort(a,n);
			 printArray(a,n);
			
		t--;
		}
		
	}
}
// } Driver Code Ends
class Solution {
    // Function to insert element at the correct position in the sorted part of the array
    static void insert(int arr[], int i) {
        int key = arr[i];  // The element to be inserted
        int j = i - 1;
        
        // Shift elements of arr[0..i-1] that are greater than key to one position ahead
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        
        // Place the key at the correct position
        arr[j + 1] = key;
    }
    
    // Recursive function to sort the array using insertion sort algorithm
    static void insertionSortRecursive(int arr[], int n) {
        // Base case: If the array size is 1 or 0, it's already sorted
        if (n <= 1) {
            return;
        }
        
        // Recursively sort the first n-1 elements
        insertionSortRecursive(arr, n - 1);
        
        // Insert the nth element into its correct position in the sorted portion
        insert(arr, n - 1);
    }

    // Function to call the recursive insertion sort
    public void insertionSort(int arr[], int n) {
        insertionSortRecursive(arr, n);
    }
}
