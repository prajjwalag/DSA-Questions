class Solution {
    public int[] reverseArray(int[] nums) {
        //your code goes here
        reverse(nums, 0, nums.length-1);
        return nums;
    }

    public void reverse(int[] nums, int l, int r) {
        if(l>=r) {
            return;
        }
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
        reverse(nums, l+1, r-1);
    }
}