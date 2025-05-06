class Solution {   
    public boolean palindromeCheck(String s) {
        //your code goes here
        return isPalindrome(s, 0, s.length()-1);
    }
    public boolean isPalindrome(String s, int l, int r) {
        if(l>=r) {
            return true;
        }

        if(s.charAt(l) != s.charAt(r)) {
            return false;
        }

        return isPalindrome(s, l+1, r-1);
    }
}