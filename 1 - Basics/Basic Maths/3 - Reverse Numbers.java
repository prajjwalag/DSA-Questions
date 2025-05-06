class Solution {
    public int reverseNumber(int n) {
        int reverse = 0;
        while(n > 0) {
            int temp = n%10;
            reverse = reverse*10 + temp;
            n/=10;
        }
        return reverse;
    }
}