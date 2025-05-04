class Solution {
  public void swap(int[] nums, int left, int right) {
    int temp = nums[left];
    nums[left] = nums[right];
    nums[right] = temp;
}

public void reverseArray(int[] nums, int left, int right) {
    while(left < right) {
        swap(nums, left, right);
        left++;
        right--;
    }
}

public void rotateArray(int[] nums, int k) {
    k = k % nums.length;
    reverseArray(nums, 0, k-1);
    reverseArray(nums, k, nums.length-1);
    reverseArray(nums, 0, nums.length-1);
}
}