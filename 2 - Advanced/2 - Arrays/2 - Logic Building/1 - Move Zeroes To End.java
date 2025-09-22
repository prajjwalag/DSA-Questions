
class Solution {
    public void moveZeroes(int[] nums) {
        
        //J keeps track of where the next non-zero should be placed
        for(int i = 0, j = 0;  i < nums.length; i++) {
            // If current element is non-zero
            if(nums[i] != 0) {
                // Swap current element with the one at index j
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                // Move j forward
                j++;
            }
        }

    }
}

/*
Intuition:

1. We keep two iterators, one just after the non-zero index where the next element can be placed and other at current element,
2. If current element is non zero, we swap it with the next j pointer element. This was j will just ahead of non-zero elements pointing at first zero of the array always.
3. We increment the j index so that it gets placed after the non zero element where next element can be placed.

Dry Run:

nums = [0, 1, 4, 0, 5, 2]
       ij
1st Iteration:
i = 0
j = 0
nums[i] = 0 : Skip if
nums = [0, 1, 4, 0, 5, 2]
        j  i

2nd Iteration:
i = 1
j = 0
nums[i] = 1 : Enter If, swap i and j elements
nums = [1, 0, 4, 0, 5, 2]
           j  i

3rd Iteration:
i = 2
j = 1
nums[i] = 4, Enter if, swap i and j elements
nums = [1, 4, 0, 0, 5, 2]
              j  i

4th Iteration
i = 3
j = 2
nums[i] = 0, Skip if
nums = [1, 4, 0, 0, 5, 2]
              j     i

5th iteration
i = 4
j = 2
nums[i] = 5 Enter if, swap i and j elements
nums = [1, 4, 5, 0, 0, 2]
                 j     i

6th iteration
i = 
j = 
nums[i] = 2 Enter if, swap i and j elements
nums = [1, 4, 5, 2, 0, 0]
                    j     i

I exceeded the array lenght, Hence loop ended.



*/
