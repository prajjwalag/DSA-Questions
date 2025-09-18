/*
Intuition: 

We separate array into two parts, sorted and unsorted part.

1. We take 1st element from the unsorted part, and place it in the correct position.
2. Start from 2nd element, and take j as i-1 and element as nums[i]
3. Iterate till the greater element from current element is found or j >= 0
4. Swap the elements to j+1 location and j--;
5. Place the element in the j+1 location after loop ends.
*/

class Solution {
    public int[] insertionSort(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
            int j = i - 1;
            int element = nums[i];
            while(j >= 0 && nums[j] > element) {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j + 1] = element;
        }
        return nums;
    }
}
