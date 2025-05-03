class Solution {    
    public String longestCommonPrefix(String[] str) {
        //your code goes here
        Arrays.sort(str);

        int noOfItems = str.length;

        int index = Math.min(str[0].length(), str[noOfItems-1].length());

        String prefix = "";
        for(int i = 0; i < index; i++) {
            if(str[0].charAt(i) == str[noOfItems-1].charAt(i)) {
                prefix = prefix+str[0].charAt(i);
            } else {
                break;
            }
        }
        return prefix;

        
    }
}