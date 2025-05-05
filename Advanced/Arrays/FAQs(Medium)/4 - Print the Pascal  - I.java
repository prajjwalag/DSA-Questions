class Solution {
    public int pascalTriangleI(int r, int c) {
        if(r == c || c == 1) {
            return 1;
        } 
        if(c == 2 || c == r-1) {
            return r-1;
        }
        return nCr(r-1, c-1);
    }
    public int nCr(int n, int r) {
        // Choose the smaller value for lesser iterations
        if( r > n-r) {
            r = n-r;
        }

        int res = 1;
        for(int i = 0; i < r; i++) {
            res = res * (n-i);
            res = res/(i+1);
        }

        return res;
    }
}s