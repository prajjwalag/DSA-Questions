class Solution {
    public boolean searchInARotatedSortedArrayII(ArrayList<Integer> nums, int k) {
        int low = 0;
        int high = nums.size()-1;

        while(low <= high) {
            int mid = low + (high - low)/2;

            if(nums.get(mid) == k) {
                return true;
            }
            if(nums.get(low) == nums.get(mid) && nums.get(mid) == nums.get(high)) { //If Low, Mid and High are equal, we cannot determine which half is sorted, so we can just skip the duplicates
                low++;
                high--;
                continue;
            }
            if (nums.get(low) <= nums.get(mid)) { //Left Half is Sorted
                if(nums.get(low) <= k && k <= nums.get(mid)) {// Target is greater than low and lower than mid, so it will exist in Left Half 
                    high = mid - 1; 
                } else { //Target is either greater than mid or lower than low, so it will not exist in Left Half 
                    low = mid + 1;
                }
            } else { //else (nums[mid] <= nums[high]) //Right Half is Sorted
                if(nums.get(mid) <= k && k <= nums.get(high)) { // Target is greater than mid and lower than high, so it will exist in Right Half
                    low = mid + 1;
                } else { // Target is either greater than high or lower than mid, so it will not exist in Right Half
                    high = mid - 1;
                }
            }
       }
       return false;
    }
}