class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Declare the result array outside the loops
        int[] result = new int[2];

        // Nested loop to find the two indices
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {  // Start j from i + 1 to avoid duplicate pairs
                // Check if the sum equals the target and ensure i and j are not the same
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result; // Return immediately once we find the pair
                }
            }
        }

        // If no solution is found, return an empty array or handle accordingly
        return new int[] {};  // Return empty array if no pair is found
    }
}
