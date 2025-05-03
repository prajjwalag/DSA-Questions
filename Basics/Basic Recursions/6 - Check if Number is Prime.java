class Solution {
    public boolean checkPrime(int num) {
        //your code goes here
        return isPrime(num, 2);
    }

    public boolean isPrime(int num, int i) {
        if(i*i >= num) {
            return true;
        }
        if(num%i == 0) {
            return false;
        }
        return isPrime(num, i+1);
    }
}