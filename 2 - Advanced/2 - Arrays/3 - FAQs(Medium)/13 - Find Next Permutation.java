class Solution {
    public void reverse(int[] nums, int startIndex, int endIndex) {
        int l = startIndex;
        int r = endIndex;

        while(l < r) {
            swap(nums, l, r);
            l++;
            r--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void nextPermutation(int[] nums) {
        
        int index = -1;
        int n = nums.length;
        //Find Longest Prefix
        for(int i = n-2; i >= 0; i--) {
            if(nums[i] < nums[i+1]) {
                index = i;
                break;
            }
        }

        //If the number is greatest already, then the next permutation
        //will be the 1st number in the permutation sequence. WHich will
        //be smallest number. So we simply reverse it to find the smallest number.
        if(index == -1) {
            reverse(nums, 0, n-1);
            return;
        }

        //Find the Smallest number but greater number than the break point number
       for(int i = n - 1; i > index; i--) {
            if(nums[i] > nums[index]) {
                swap(nums, i, index);  // Swap with nums[ind]
                break;
            }
        }

        //Reverse the remaining array to find the next greater number.
        reverse(nums, index+1, n-1);
        return;
    }
}