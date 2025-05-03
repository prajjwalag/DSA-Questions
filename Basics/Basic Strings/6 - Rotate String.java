class Solution {   
    public boolean rotateString(String s, String goal) {
        //your code goes here
       int n = s.length();
       String left = "";
       String right = s;
       for(int i = 0; i < n; i++) {
            if((right+left).equals(goal)) {
                return true;
            }
            right = s.substring(i+1);
            left+=s.charAt(i); 
       }
       return false;
    }
}