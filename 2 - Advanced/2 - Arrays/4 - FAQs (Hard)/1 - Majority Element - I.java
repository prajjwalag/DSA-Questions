class Solution {
    public int majorityElement(int[] nums) {
        int el = nums[0];
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == el) {
                count++;
            } else  {
                count--;
            }
            if(count == 0) {
                el = nums[i+1];
            }
        }
        int maj = 0;
        if(count != 0) {
            for(int i = 0; i < nums.length; i++) {
                if(el == nums[i]) {
                    maj++;
                }
            }
        }
        if(maj > nums.length/2) {
            return el;
        }
        return -1;
    }
}