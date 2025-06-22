class Solution {
    public int search(int[] nums, int k) {
       int low = 0;
       int high = nums.length-1;
       
       while(low <= high) {
            int mid = low + (high - low)/2;

            if(nums[mid] == k) {
                return mid;
            } else if (nums[low] <= nums[mid]) { //Left Half is Sorted
                if(nums[low] <= k && k <= nums[mid]) {// Target is greater than low and lower than mid, so it will exist in Left Half 
                    high = mid - 1; 
                } else { //Target is either greater than mid or lower than low, so it will not exist in Left Half 
                    low = mid + 1;
                }
            } else { //else (nums[mid] <= nums[high]) //Right Half is Sorted
                if(nums[mid] <= k && k <= nums[high]) { // Target is greater than mid and lower than high, so it will exist in Right Half
                    low = mid + 1;
                } else { // Target is either greater than high or lower than mid, so it will not exist in Right Half
                    high = mid - 1;
                }
            }
       }
       return -1;
    }
}
