class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num; // pick new candidate
            }

            // increase count if same, else decrease
            count += (num == candidate) ? 1 : -1;
        }

        return candidate; // this will always be the majority element
    }
}
