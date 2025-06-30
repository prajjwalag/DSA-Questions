
class Solution {
    public int calculateNumberOfBouqets(int[] nums, int day, int k, int m) {
      int count = 0;
      int numberOfBouqets = 0;

      for(int i = 0; i < nums.length; i++) {
        if(day >= nums[i]) {
          count++;
        } else  {
          numberOfBouqets += count/k;
          count = 0;
        }
      }
      numberOfBouqets += count/k;
      return numberOfBouqets;
    }
    public int roseGarden(int n, int[] nums, int k, int m) {
        long requiredNumberOfRoses = (long) k * m;

        if(n < requiredNumberOfRoses) {
          return -1;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++)  {
          max = Math.max(nums[i], max);
          min = Math.min(nums[i], min);
        }

        int low = min;
        int high = max;

        while(low <= high) {
          int mid = low + (high - low)/2;

          int possibleNumberOfBouqets = calculateNumberOfBouqets(nums, mid, k, m);
          if(possibleNumberOfBouqets >= m) {
            high = mid - 1;
          } else {
            low = mid + 1;
          }
        }
        return low;
    }
}


