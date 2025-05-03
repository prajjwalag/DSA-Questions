class Solution {
    public boolean isPerfect(int n) {
        int divisorSum = 0;
        
        for(int i = 1; i <= n/2; i++) {
            if(n%i == 0) {
                divisorSum += i;
            }
        }
        return n == divisorSum;
    }
}