class Solution {
    private int findFloor(int[] nums, int n, int x) {
        int low = 0, high = n - 1;

        // Stores the floor value
        int ans = -1;

        // Perform binary search to find the floor value
        while (low <= high) {
            int mid = (low + high) / 2;

             /*Check if mid element lesser than 
			      or equal to x, if it is update ans 
		        and eliminate the left half */
            if (nums[mid] <= x) {
                ans = nums[mid];
                low = mid + 1;
            }
            /*If mid element greater than x, 
            then eliminate the right half */
            else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private int findCeil(int[] nums, int n, int x) {
        int low = 0, high = n - 1;
        int ans = -1;

        // Perform binary search to find ceil value
        while (low <= high) {
            int mid = (low + high) / 2;

            /*Check if mid element greater than 
			      or equal to x, if it is update ans 
		        and eliminate the left half */
            if (nums[mid] >= x) {
                ans = nums[mid];
                high = mid - 1;
            }
            /*If mid element lesser than x, 
            then eliminate the left half */
            else {
                low = mid + 1;
            }
        }
        return ans;
    }

 
    public int[] getFloorAndCeil(int[] nums, int x) {

       int n = nums.length;

        /*Function call to find the floor 
        value using helper functions*/
        int floor = findFloor(nums, n, x);

        /* Function call to find the ceil 
        value using helper functions*/
        int ceil = findCeil(nums, n, x);

        return new int[] {floor,ceil};
    }
}