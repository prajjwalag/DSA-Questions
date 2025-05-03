class Solution {
    public int LCM(int n1, int n2) {
        int max = Math.max(n1, n2);
        for(int i = max; i <= n1*n2; i+=max) {
            if(i%n1 == 0 && i%n2 == 0) {
                return i;
            }
        }
        return n1*n2;
    }
}