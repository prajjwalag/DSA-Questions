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
