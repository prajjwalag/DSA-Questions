class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        int longest = 1;
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        
        for(int num: set) {
            if(!set.contains(num-1)) {
                int count = 1;
                int currNum = num;

                while(set.contains(currNum+1)) {
                    count++;
                    currNum++;
                }
                longest = count > longest ? count : longest;
            }
           
        }
        return longest;
    }
}