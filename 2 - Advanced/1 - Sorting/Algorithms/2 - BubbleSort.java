/*
Intuition:

Iterate through the array and compare two consecutive elements, if the ith element is greater than
i+1th element, then swap both of them

1. Run a loop from 0 to n-1.
2. Run a nested loop, from 0 to n - i - 1, because in each iteration, the largest element will be placed at the last index
    So, we do not need to compare in the sorted area.
3. Check if j > j+1, if true then swap it.
4. At last, check if any element is swapped or not, if not swapped, then that means, array is already sortedm hence break the loop.
*/

class Solution {
    public int[] bubbleSort(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            boolean isSwapped = false;
            for(int j = 0; j < nums.length - i - 1; j++) {
                if(nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped) {
                break;
            }
        }
        return nums;
    }
}
