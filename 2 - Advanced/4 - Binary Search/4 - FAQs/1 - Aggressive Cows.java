class Solution {
    public boolean canWePlace(int[] nums, int noOfCows, int minDistance) {
      int cowsCount = 1;
      int lastCowPosition = nums[0];

      for(int i = 1; i < nums.length; i++) {
        if(nums[i] - lastCowPosition >= minDistance) {
          lastCowPosition = nums[i];
          cowsCount++;
        }

        if(cowsCount >= noOfCows) {
          return true;
        }
      }
      return false;
    }

    public int aggressiveCows(int[] nums, int k) {
      Arrays.sort(nums);

      int max = Integer.MIN_VALUE;

      for(int i = 0; i < nums.length; i++) {
        max = Math.max(max, nums[i]);
      }

      int low = 1;
      int high = max;

      while(low <= high) {
        int mid = low + (high - low)/2;
        if(canWePlace(nums, k, mid)) {
          low = mid + 1;
        } else {
          high = mid - 1;
        }
      }
      return high;
    } 
}
