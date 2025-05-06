class Solution {
    public Vector<Character> reverseString(Vector<Character> s) {
        //your code goes here
        reverse(s, 0, s.size()-1);
        return s;
    }
    public void reverse(Vector<Character> s, int l, int r) {
        if(l >= r) {
            return;
        }
        char c = s.get(l);
        s.set(l, s.get(r));
        s.set(r, c);
        reverse(s, l+1, r-1);
    }
}