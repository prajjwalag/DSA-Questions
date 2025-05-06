class Solution {
    public int[] quickSort(int[] nums) {
        quickSortHelper(nums, 0, nums.length-1);
        return nums;
    }
    public void quickSortHelper(int[] nums, int low, int high) {
        if(low>=high) {
            return;
        }
        int partition = quick(nums, low, high);
        quickSortHelper(nums, low, partition-1);
        quickSortHelper(nums, partition+1, high);
    }
    public int quick(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i < j) {
            while( i < high && arr[i] <= pivot) {
                i++;
            }
            while(j > low && arr[j] > pivot ) {
                j--;
            }
            if(i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
}