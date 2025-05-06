class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currCount = 0;
        int maxCount = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                currCount++;
            } else if(maxCount < currCount) {
                    maxCount = currCount;
                    currCount = 0;
            } else {
                currCount = 0;
            }
        }
        if(currCount > maxCount ) {
            maxCount = currCount;
        }
        return maxCount;
    }
}