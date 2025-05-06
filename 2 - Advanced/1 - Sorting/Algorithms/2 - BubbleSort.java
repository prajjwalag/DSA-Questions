class Solution {
    public int[] bubbleSort(int[] nums) {
        int swapCount = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length-1; j++) {
                if(nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp; 
                    swapCount++;
                }
            }
            if(swapCount==0){
                break;
            }
        }
        return nums;
    }
}