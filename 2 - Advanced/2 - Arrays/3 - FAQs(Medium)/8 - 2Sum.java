class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Total Length of the nums array
        int size = nums.length;

        //To Store the result
        int[] ans = new int[]{-1, -1};

        //To Store the elements and their index in an array.
        int[][] elementsIndex = new int[size][2];

        //Copy the elements.
        for(int i = 0; i < size; i++) {
            elementsIndex[i][0] = nums[i];
            elementsIndex[i][1] = i;
        }

        //Sort the elementsIndex based upon its elements.
        Arrays.sort(elementsIndex, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });

        int left = 0;
        int right = size-1;
        while(left<right) {
            int sum = elementsIndex[left][0] + elementsIndex[right][0];
            if(sum == target) {
                ans[0] = elementsIndex[left][1];
                ans[1] = elementsIndex[right][1];
                return ans;
            } else if(sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }
}