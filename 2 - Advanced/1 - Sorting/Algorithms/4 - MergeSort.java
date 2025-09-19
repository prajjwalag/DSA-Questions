


class Solution {
    public void merge(int[] nums, int low, int mid, int high) {
        int left = low;
        int right = mid+1;
        List<Integer> array = new ArrayList<>();

        while(left <= mid && right <= high) {
            if(nums[left] <= nums[right]) {
                array.add(nums[left]);
                left++;
            } else {
                array.add(nums[right]);
                right++;
            }
        }

        while(left <= mid) {
            array.add(nums[left]);
            left++;
        }

        while(right <= high) {
            array.add(nums[right]);
            right++;
        }

        int index = 0;
        for(int i = low; i <= high; i++ ) {
            nums[i] = array.get(index++);
        }
    }
    public void mergeSortHelper(int[] nums, int low, int high) {
        if(low >= high) {
            return;
        }
        
        int mid = low + (high-low)/2;

        mergeSortHelper(nums, low, mid);
        mergeSortHelper(nums, mid+1, high);
        merge(nums, low, mid, high);
    }
    public int[] mergeSort(int[] nums) {
        int n = nums.length-1;
        mergeSortHelper(nums, 0, n);
        return nums;
    }
}
