class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int low = 1; //Starting from index 1 because we will compare mid with mid-1, so we need at least one element before mid.
        int high = n-2; //High is n-2 because we will compare mid with mid+1, so we need at least one element after mid.
        
        //The pair will always be at even and odd indices, 
        //If We are at an even index, then the pair will be at the next index (odd index).
        //If We are at an odd index, then the pair will be at the previous index (even index).
        //If the above condition is satisfied, then the single non-duplicate element will be at right half.
        //If the above condition is not satisfied, then the single non-duplicate element will be at left half.

        //Eliminate edge cases
        if(nums.length == 1) { // If the array has only one element, then that is the single non-duplicate element.
            return nums[0];
        }
        if(nums[0] != nums[1]) { // If the first element is not equal to the second element, then the first element is the single non-duplicate element.
            return nums[0];
        } 
        if(nums[n-1] != nums[n-2]) { // If the last element is not equal to the second last element, then the last element is the single non-duplicate element.
            return nums[n-1];
        }

        while(low <= high) {
            int mid = low + (high - low)/2;

            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) { // If mid is not equal to its neighbours, then mid is the single non-duplicate element.
                return nums[mid];
            } else if(( mid % 2 == 0 && nums[mid] == nums[mid + 1] ) || (mid % 2 == 1) && nums[mid] == nums[mid-1]) { // If mid is even and mid is equal to mid+1, or if mid is odd and mid is equal to mid-1, then the single non-duplicate element is in the right half.
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}