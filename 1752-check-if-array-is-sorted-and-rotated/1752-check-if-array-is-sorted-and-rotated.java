public class Solution {  // Renamed the class from RotatedSortedArrayCheck to Solution
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        // Traverse the array and count the number of breakpoints
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            // If there are more than 1 breakpoints, return false
            if (count > 1) {
                return false;
            }
        }

        // If there is at most one breakpoint, return true
        return true;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 4, 5, 1, 2};
        int[] nums2 = {2, 1, 3, 4};
        int[] nums3 = {1, 2, 3};

        Solution solution = new Solution();

        System.out.println(solution.check(nums1)); // Output: true
        System.out.println(solution.check(nums2)); // Output: false
        System.out.println(solution.check(nums3)); // Output: true
    }
}
