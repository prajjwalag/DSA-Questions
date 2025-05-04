class Solution {
    public int largestElement(int[] nums) {
        int maxNum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if(maxNum < nums[i]) {
                maxNum = nums[i];
            }
        }
        return maxNum;
    }
}