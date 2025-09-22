/*
Approach 
1. Initialize 2 variables i as 0 and variable j as 1, where i will track the position of the last unique element found and j will iterate 
   through the array to find new unique elements.
2. Iterate in array using j from second element to the end of the array.
3. If the element at position j is different from the element at position i, it means a new unique element is found. This is because the 
   array is sorted in non-decreasing order, so any new element that is different from the previous one must be unique.
4. When a new unique element is found, increment i to move to the next position for storing unique elements. Copy the element at position 
   j to the new position at i. This ensures that the first i + 1 elements of the array are all unique.
5. Continue comparing elements and updating the array until j has iterated through the entire array. Once the loop completes, the value of
   i + 1 represents the number of unique elements in the array
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        // Initialize pointer for unique elements,
        
        int j = 0;
        for(int i = 1; i < nums.length; i++) {
          /*If current element is different 
            from the previous unique element*/
          if(nums[j] != nums[i]) {
            /* Move to the next position in 
            the array for the unique element*/
            j++;
            /* Update the current position 
              with the unique element*/
            nums[j] = nums[i];
          }
        }
        // Return the number of unique elements
        return j+1;
    }
}
