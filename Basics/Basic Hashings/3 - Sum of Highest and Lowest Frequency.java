class Solution {
    public int sumHighestAndLowestFrequency(int[] nums) {
      Map<Integer, Integer> hash = new HashMap<>();
        int maxFreq = 0;
       
        int minFreq = Integer.MAX_VALUE;
    
        for(int i = 0; i < nums.length; i++) {
            hash.put(nums[i], hash.getOrDefault(nums[i], 0) + 1);
        }

        for(Map.Entry<Integer, Integer> it : hash.entrySet()) {
            int ele = it.getKey();
            int freq = it.getValue();
            
            if(freq == 0) continue;

            if(freq < minFreq) {
                minFreq = freq;
            }
            if(freq > maxFreq) {
                maxFreq = freq;
            }
        }
        return maxFreq + minFreq;
    }
}
