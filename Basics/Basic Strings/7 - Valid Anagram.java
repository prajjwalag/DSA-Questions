class Solution {  
    public boolean anagramStrings(String s, String t) {
        // //your code goes here
        // if(s.length()!=t.length()) {
        //     return false;
        // }
        // HashMap<Character, Integer> smap = new HashMap<>();
        // HashMap<Character, Integer> tmap = new HashMap<>();
        // for(int i = 0; i<s.length(); i++) {
        //     smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i), 0)+1);
        //     tmap.put(t.charAt(i), tmap.getOrDefault(t.charAt(i), 0)+1);
        // }
        // for(Map.Entry<Character, Integer> it: smap.entrySet()) {
        //     char ch = it.getKey();
        //     int n = it.getValue();

        //     if(n != tmap.getOrDefault(ch, 0)) {
        //         return false;
        //     }
            
        // }
        // return true;

         if(s.length()!=t.length()) {
            return false;
        }
        int[] sMap = new int[26];
        
        for(int i = 0; i < s.length(); i++) {
            sMap[s.charAt(i)-'a']++;
        }
        for(int i = 0; i < s.length(); i++) {
            sMap[t.charAt(i)-'a']--;
        }
        for(int i = 0; i < 26; i++) {
           if(sMap[i]!=0 ) {
            return false;
           }
        }
        return true;
    }
}