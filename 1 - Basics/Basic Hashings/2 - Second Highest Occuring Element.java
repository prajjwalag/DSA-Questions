class Solution {
    public int secondMostFrequentElement(int[] nums) {
        Map<Integer, Integer> hash = new HashMap<>();
        int maxFreq = 0;
        int maxEle = -1;
        int secondMostFrequentElement = -1;
        int secondMaxFreq = 0;
        for(int i = 0; i < nums.length; i++) {
            hash.put(nums[i], hash.getOrDefault(nums[i], 0) + 1);
        }

        for(Map.Entry<Integer, Integer> it : hash.entrySet()) {
            int ele = it.getKey();
            int freq = it.getValue();

            if(freq > maxFreq) {
                secondMaxFreq = maxFreq;
                secondMostFrequentElement = maxEle;
                maxFreq = freq;
                maxEle = ele;
            } else if (freq < maxFreq && freq > secondMaxFreq) {
                secondMaxFreq = freq;
                secondMostFrequentElement = ele;
            } 
            else if(freq == secondMaxFreq) {
                secondMostFrequentElement = Math.min(secondMostFrequentElement, ele);
            }
        }
        return secondMostFrequentElement;
    }
}

