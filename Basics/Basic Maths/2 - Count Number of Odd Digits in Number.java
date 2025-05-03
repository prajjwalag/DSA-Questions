class Solution {
    public int countOddDigit(int n) {
        if(n < 0) {
            n*=-1;
        }
        int count = 0;
        while( n > 0) {
            int num = n%10;
            if(num%2 == 1) {
                count++;
            }
            n/=10;
        }
        return count;
    }
}