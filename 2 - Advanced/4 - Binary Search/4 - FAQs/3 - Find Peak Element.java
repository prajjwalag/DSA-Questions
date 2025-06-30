import java.util.*;

class Solution {
    // Function to find peak element in the array
    public int findPeakElement(int[] arr) {
        // Size of array
        int n = arr.length;
        
        /* Iterate through the array
           to find the peak element */
        for (int i = 0; i < n; i++) {
            
            // Check if arr[i] is a peak
            if ((i == 0 || arr[i - 1] < arr[i]) && (i == n - 1 || arr[i] > arr[i + 1])) {
                
                // Return the index of peak element
                return i;
            }
        }
        /* Return -1 if no peak element
           found (dummy return) */
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 5, 1};
        
        // Create an instance of the Solution class
        Solution sol = new Solution();
        
        int ans = sol.findPeakElement(arr);
        
        // Output the result
        System.out.println("The peak is at index: " + ans);
    }
}
