class Solution {
    public int fib(int n) {
        //your code goes here
        if(n <= 2) {
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
}