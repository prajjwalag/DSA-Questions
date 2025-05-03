class Solution {
    public int factorial(int n) {
        if(n == 0) {
            return 1;
        }
        int fact = n;
        while( n > 1 ) {
            fact*=--n;
        }
        return fact;
    }
}