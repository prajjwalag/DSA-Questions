class Solution {
    public int[] intersectionArray(int[] nums1, int[] nums2) {
        List<Integer> intersectionList = new ArrayList<>();

        int size1 = nums1.length;
        int size2 = nums2.length;
        int i = 0;
        int j = 0;

        while(i < size1 && j < size2) {
            if(nums1[i] < nums2[j]) {
                i++;
            } else if(nums2[j] < nums1[i]) {
                j++;
            } else {
                intersectionList.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] arr = new int[intersectionList.size()];
        for(int k = 0; k < intersectionList.size(); k++) {
            arr[k] = intersectionList.get(k);
        }
        return arr;
    }
}