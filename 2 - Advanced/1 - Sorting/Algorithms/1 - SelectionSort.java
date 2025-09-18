/*
Intuition: 
1. Iterate through Array and find the minimum element every time.
2. In each iteration, consider that minimum element is the current element.
3. In a nested loop, find the minimum element.
4. If minimum Element index is not the current index, then swap the minimum element with the current element.
5. By repeating this, atlast there will only 1 element left, which can not be compared from any other element
    and it will be the largest element. Hence, we can leave the last element, that's why we are iterating to n-1 only.
*/


class Solution {
    public int[] selectionSort(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            int minIndex = i;
            for(int j = i+1; j < nums.length; j++) {
                if(nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            if(minIndex != i) {
                int temp = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i] = temp;
            }
        }
        return nums;
    }
}
