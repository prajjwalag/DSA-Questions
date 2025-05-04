class Solution {
    public void rotateArrayByOne(int[] nums) {
        int firstNum = nums[0];
        for(int i = 1; i < nums.length; i++) {
            nums[i-1] = nums[i];
        }
        nums[nums.length-1] = firstNum;
    }
}