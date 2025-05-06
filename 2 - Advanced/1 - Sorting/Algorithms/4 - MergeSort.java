class Solution {
    public int[] mergeSort(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        mergeSorting(nums, low, high);
        return nums;
    }
    public void mergeSorting(int[] nums, int low, int high) {
        
        if(low>=high) {
            return;
        }
        
        int mid = low+(high-low)/2;
        mergeSorting(nums, low, mid);
        mergeSorting(nums, mid+1, high);
        merge(nums, low, mid, high);
    }
    public void merge(int[] nums, int low, int mid, int high) {
        ArrayList<Integer> tempArr = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left <= mid && right <= high) {
            if(nums[left] <= nums[right]) {
                tempArr.add(nums[left]);
                left++;
            } else {
                tempArr.add(nums[right]);
                right++;
            }
        }
        while(left <= mid) {
            tempArr.add(nums[left]);
            left++;
        }
        while(right <= high) {
            tempArr.add(nums[right]);
            right++;
        }
        for(int i = low; i<=high; i++) {
            nums[i] = tempArr.get(i-low);
        }
    }
}