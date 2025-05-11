class Solution {

    public int mergeSort(int[] nums, int low, int high) {
        int count = 0;

        if(low >= high) {
            return count;
        }

        int mid = low + ( high - low )/2;
        count += mergeSort(nums, low, mid);
        count += mergeSort(nums, mid+1, high);
        count += countReversePairs(nums, low, mid, high);
        merge(nums, low, mid, high);
        
        return count;
    }

    public void merge(int[] nums, int low, int mid, int high) {
        int left = low;
        int right = mid+1;
        int index = 0;
        int[] temp = new int[high-low+1];

        while(left <= mid && right <= high) {
            if(nums[left] <= nums[right]) {
                temp[index] = nums[left];
                index++;
                left++;
            } else {
                temp[index] = nums[right];
                index++;
                right++;
            }
        }

        while(left <= mid) {
            temp[index] = nums[left];
            index++;
            left++;
        }

        while(right <= high) {
            temp[index] = nums[right];
            index++;
            right++;
        }

        left = low;
        for(int i = 0; i < high-low+1; i++) {
            nums[left] = temp[i];
            left++;
        }

    }

    public long countReversePairs(int[] nums, int low, int mid, int high) {
        int right = mid + 1;
        int count = 0;

        for(int i = low; i <= mid; i++) {
            while(right <= high && nums[i] > 2 * nums[right]) {
                right++;
            }
            count += (right - (mid+1));
        }
        return count;
    }

    public int reversePairs(int[] nums) {
        int n = nums.length;
        int count = mergeSort(nums, 0, n-1);
        return count;   
    }
}