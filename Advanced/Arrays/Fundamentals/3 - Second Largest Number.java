class Solution {
    public int secondLargestElement(int[] nums) {
        int maxNum = Integer.MIN_VALUE;
        int secondNum = -1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > maxNum && maxNum == Integer.MIN_VALUE) {
                maxNum = nums[i];
            } else if(nums[i] > maxNum) {
                secondNum = maxNum;
                maxNum = nums[i];
            } else if(nums[i] < maxNum && nums[i] > secondNum) {
                secondNum = nums[i];
            }
        }
        return secondNum;
    }
}