class Solution {    
    public String largeOddNum(String s) {
        //your code goes here
        int initialIndex = -1;
        int finalIndex = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c != '0' && initialIndex == -1) {
                initialIndex = i;
            }
            if(c == '1' || c == '3' || c == '5' || c == '7' || c == '9'){
                finalIndex = i;
            }
        }
        
        return s.substring(initialIndex, finalIndex+1);
    }
}