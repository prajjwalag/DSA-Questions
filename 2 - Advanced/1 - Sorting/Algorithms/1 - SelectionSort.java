class Solution {
    public int[] selectionSort(int[] nums) {
        for(int i = 0; i<nums.length-1; i++) {
            int minIndex = i;
            int minEle = nums[i];
            for(int j = i+1; j < nums.length; j++) {
                if(nums[j] < minEle) {
                    minEle = nums[j];
                    minIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = minEle;
            nums[minIndex] = temp;
        }
        return nums;
    }
}