class Solution {
    public long factorial(int n) {
        //your code goes here
        if(n <= 1) {
            return 1;
        }
        return n*factorial(n-1);
    }
}