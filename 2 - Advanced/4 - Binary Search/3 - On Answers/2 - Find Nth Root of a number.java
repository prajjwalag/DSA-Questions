class Solution {
    public int NthRoot(int N, int M) {
        int low = 1;
        int high = M;
        

        while(low <= high) {
            int mid = low + (high-low)/2;
            int checkAns = (int) Math.pow(mid, N);
            if(checkAns == M) {
                return mid;
            } else if(checkAns < M) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }

        return -1;
    }
}

//Aproach 2
class Solution {
    public long calculateNthPower(int num, int power, int target) {
      long ans = 1;
       while(power > 0) {
          ans *= num;
          if(ans > target) {
            return ans;
          }
          power--;
       }
       return ans;
    }
    public int NthRoot(int N, int M) {
        int low = 1;
        int high = M;

        while(low <= high) {
           int mid = low + (high - low)/2;

           long value = calculateNthPower(mid, N, M);

           if(value == M) {
              return mid;
           } else if(value < M) {
              low = mid + 1;
           } else {
             high = mid -1;
           }
        }
        return -1;
    }
}
