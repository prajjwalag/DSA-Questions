class Solution {
    public void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
    public void sortZeroOneTwo(int[] nums) {
        int i = 0;
        int j = 0;
        int k = nums.length-1;
        while(j <= k) {
            if(nums[j] == 0) {
                swap(nums, i, j);
                i++;
                j++;
            } else if(nums[j] == 1) {
                j++;
            } else {
                swap(nums, j, k);
                k--;
            }
            
        }
    }
}