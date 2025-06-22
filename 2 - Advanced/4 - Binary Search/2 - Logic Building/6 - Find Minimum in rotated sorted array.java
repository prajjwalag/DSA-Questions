class Solution {
    public int findMin(ArrayList<Integer> nums) {
        int low = 0;
        int high = nums.size()-1;
        int lowest = Integer.MAX_VALUE;

        //Our answer is the pivot index, Where the lowest will lie because it is a sorted rotated array.

        while(low <= high) {
            int mid = low + (high - low)/2;
            
            //If Search Space is Already Sorted, Then Nums[Low] will always be the answer.
            if(nums.get(low) <= nums.get(high)){
                if(nums.get(low) < lowest) {
                    lowest = nums.get(low);
                }
                break;
            }

            if (nums.get(low) <= nums.get(mid)) {  //If Left Half is Sorted, Pivot Element might be in the right half, or the low index is the pivot index
                if(nums.get(low) < lowest) {
                    lowest = nums.get(low);
                }
                low = mid + 1; 
            } else { //If Right Half is Sorted, Pivot element might be mid element or it might exist in the left half.
                if(nums.get(mid) < lowest) { 
                    lowest = nums.get(mid);
                }
                high = mid - 1;
            }
        }
        return lowest;
    }
}
// Time Complexity: O(log n)
// Space Complexity: O(1)