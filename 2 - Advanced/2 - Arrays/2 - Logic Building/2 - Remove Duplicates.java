class Solution {
    public int removeDuplicates(int[] nums) {
        int currIndex = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[currIndex]) {
                currIndex++;
                nums[currIndex] = nums[i];
            }  
        }
        return currIndex+1;
    }
}