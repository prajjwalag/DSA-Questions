class Solution {   
    public boolean palindromeCheck(String s) {
        //your code goes here
        int l = 0;
        int r = s.length()-1;
        while(l<r) {
            if(s.charAt(l)!= s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}