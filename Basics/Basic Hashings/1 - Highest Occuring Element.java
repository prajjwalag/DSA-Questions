class Solution {
    public int mostFrequentElement(int[] nums) {
        Map<Integer, Integer> hash = new HashMap<>();
        int maxFreq = 0;
        int maxEle = 0;
        for(int i = 0; i < nums.length; i++) {
            hash.put(nums[i], hash.getOrDefault(nums[i], 0) + 1);
        }

        for(Map.Entry<Integer, Integer> it : hash.entrySet()) {
            int ele = it.getKey();
            int freq = it.getValue();

            if(freq > maxFreq) {
                maxFreq = freq;
                maxEle = ele;
            } else if(freq == maxFreq) {
                maxEle = Math.min(maxEle, ele);
            }
        }
        return maxEle;
     
    }
}


