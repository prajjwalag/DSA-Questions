class Solution {
      private boolean canWePlace(int[] nums, int dist, int cows) {
        // Size of array
        int n = nums.length;

        // Number of cows placed
        int cntCows = 1;

        // Position of last placed cow
        int last = nums[0];
        
        for (int i = 1; i < n; i++) {
            if (nums[i] - last >= dist) {
                // Place next cow
                cntCows++;

                // Update the last location
                last = nums[i];
            }
            if (cntCows >= cows) return true;
        }
        return false;
    }

    /* Function to find the maximum possible minimum
    distance 'k' cows can have between them in nums */
    public int aggressiveCows(int[] nums, int k) {
        // Size of array
        int n = nums.length;
        // Sort the nums
        Arrays.sort(nums);

        int low = 1, high = nums[n - 1] - nums[0];

        //Apply binary search:
        while (low <= high) {
            int mid = (low + high) / 2;
            if (canWePlace(nums, mid, k) == true) {
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return high;
    }
}
