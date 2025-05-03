class Solution {
    public boolean isPalindrome(int n) {
        int reverse = 0;
        int temp = n;
        while(temp > 0) {
            int digit = temp%10;
            reverse = reverse * 10 + digit;
            temp/=10;
        }
        boolean palindrome = n == reverse ? true : false;
        return palindrome;
    }
}