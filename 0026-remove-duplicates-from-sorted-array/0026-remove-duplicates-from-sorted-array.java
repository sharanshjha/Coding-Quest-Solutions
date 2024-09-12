 class Solution {
    public int removeDuplicates(int[] nums) {
        // Check if the array is empty
        if (nums.length == 0) {
            return 0;
        }

        // Initialize the second pointer for unique elements
        int j = 1;

        // Traverse the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Check if the current element is different from the last unique element
            if (nums[i] != nums[i - 1]) {
                // Update the unique element position
                nums[j] = nums[i];
                // Increment the pointer for unique elements
                j++;
            }
        }

        // Return the count of unique elements
        return j;
    }
}
