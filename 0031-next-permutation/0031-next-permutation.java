class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i=n-2;
        //int j=0;
        while(i >= 0 && nums[i+1] <= nums[i]){
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(i,j,nums);
        }
        reverse(i+1,n-1,nums);
    }
    void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    void reverse(int s, int e, int[] nums){
        while(s < e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;e--;
        }
    }
}