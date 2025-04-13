class Solution {
    public void moveZeroes(int[] nums) {
        int lsn=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[lsn++]=nums[i];
            }
        }
        for(int i=lsn;i<nums.length;i++){
            nums[i]=0;
        }
    
    }
}