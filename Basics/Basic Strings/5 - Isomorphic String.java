class Solution {
    public boolean isomorphicString(String s, String t) {
        //your code goes here
        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();
        int size = s.length();

        for(int i = 0; i < size; i++) {
            if(smap.containsKey(s.charAt(i))) {
                if(smap.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
            if(tmap.containsKey(t.charAt(i))) {
                if(tmap.get(t.charAt(i)) != s.charAt(i)) {
                    return false;
                }
            } else {
                smap.put(s.charAt(i), t.charAt(i));
                tmap.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
}