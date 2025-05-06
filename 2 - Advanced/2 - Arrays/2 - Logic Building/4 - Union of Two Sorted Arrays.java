class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        int size1 = nums1.length;
        int size2 = nums2.length;
        int i = 0;
        int j = 0;
        List<Integer> nums = new ArrayList<>();
        
        while(i < size1 && j < size2) {
            if(nums1[i] <= nums2[j]) {
                if(nums.isEmpty() || nums.get(nums.size() - 1) != nums1[i]) {
                    nums.add(nums1[i]);
                }
                i++;
            } else if (nums1[i] > nums2[j]) {
                if(nums.isEmpty() || nums.get(nums.size() - 1) != nums2[j]) {
                    nums.add(nums2[j]);
                }
                j++;   
            } 
        }

        while(i < size1) {
            if(nums.isEmpty() || nums.get(nums.size() - 1) != nums1[i]) {
                nums.add(nums1[i]);
            }
            i++;      
        }
        
        while(j < size2) {
            if(nums.isEmpty() || nums.get(nums.size() - 1) != nums2[j]) {
                nums.add(nums2[j]);
            }
            j++;
                
        }

        return nums.stream().mapToInt(Integer::intValue).toArray();
    }
}