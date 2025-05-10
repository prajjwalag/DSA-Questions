class Solution {
    public List<Integer> majorityElementTwo(int[] nums) {
        int count1 = 0, count2 = 0;
        int el1=nums[0], el2=nums[0];

        int n = nums.length;
        int threshold = n/3;

        for(int i = 0; i < n; i++) {
            if(count1 == 0 && el2 != nums[i]) {
                el1 = nums[i];
                count1 = 1;
            } else if(count2 == 0 && el1 != nums[i]) {
                el2 = nums[i];
                count2 = 1;
            } else if(el1 == nums[i]) {
                count1++;
            } else if(el2 == nums[i]) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        int majCount1 = 0;
        int majCount2 = 0;
        for(int i=0; i < n; i++) {
            if(el1 == nums[i]) {
                majCount1++;
            } else if(el2 == nums[i]) {
                majCount2++;
            }
        }

        List<Integer> majorityElements = new ArrayList<>();
        if(majCount1 > threshold) {
            majorityElements.add(el1);
        }
        if(majCount2 > threshold) {
            majorityElements.add(el2);
        }

        return majorityElements;
    }
}