class Solution {
    //Aproach 1
    public long floorSqrt1(long n) {
        long low = 1;
        long high = n;
        long sqrt = 0;
        
        while(low <= high) {
            long mid = low + (high - low)/2;

            long square = mid*mid;
            if(square == n) {
                return mid;
            } else if(square < n) {
                sqrt = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return sqrt;
    }
    //Aproach 2
     public long floorSqrt2(long n) {
        long low = 1;
        long high = n;
        
        while(low <= high) {
            long mid = low + (high - low)/2;

            if(mid*mid <= n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return high;
    }
}