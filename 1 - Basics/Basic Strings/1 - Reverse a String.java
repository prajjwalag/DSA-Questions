class Solution {
    public void reverseString(Vector<Character> s) {
        int l = 0;
        int r = s.size()-1;

        while(l<r) {
            char temp = s.get(l);
            s.set(l, s.get(r));
            s.set(r, temp);
            l++;
            r--;
        }
    }
}