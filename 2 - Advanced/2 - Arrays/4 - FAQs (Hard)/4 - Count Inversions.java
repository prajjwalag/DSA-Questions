class Solution {
    public long mergeSort(int[]nums, int low, int high) {
        if(low >= high) {
            return 0;
        } 

        int count = 0;
        int mid = low + (high-low)/2;

        count += mergeSort(nums, low, mid);
        count += mergeSort(nums, mid+1, high);
        count += merge(nums, low, mid, high);

        return count;
    }

    public long merge(int[] nums, int low, int mid, int high) {
        int count = 0;

        int left = low;
        int right = mid+1;

        int size = high-low+1;        
        int[] temp = new int[size];
        int index = 0;

        while(left <= mid && right <= high) {
            if(nums[left] <= nums[right] ) {
                temp[index] = nums[left];
                left++;
            } else {
                temp[index] = nums[right];
                right++;
                count += (mid - left + 1);
            }
            index++;
            
        }

        while(left <= mid) {
            temp[index] = nums[left];
            left++;
            index++;
        }

        while(right <= high) {
            temp[index] = nums[right];
            right++;
            index++;
        }

        left = low;

        for(int i = 0; i < size; i++) {
            nums[low] = temp[i];
            low++;
        }

        return count;
    }

    public long numberOfInversions(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        long count = mergeSort(nums, low, high);
        return count;
    }
}