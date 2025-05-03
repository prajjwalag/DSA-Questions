class Solution {
    public int addDigits(int num) {
        //your code goes here
        if(num <= 9) {
            return num;
        }
        int sum = sumDigits(num);
        
        return addDigits(sum);
    }
    public int sumDigits(int num) {
        if(num <= 9) {
            return num;
        }
        return num%10 + sumDigits(num/10);
    }
}