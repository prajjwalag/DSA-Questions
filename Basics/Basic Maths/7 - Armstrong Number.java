class Solution {
    public boolean isArmstrong(int n) {
        int digits =(int)(Math.log10(n)) + 1;
       
        int temp = n;
        int armstrong = 0;
        while(temp > 0) {
            int digit = temp%10;
            armstrong += Math.pow(digit, digits);
            temp/=10;
        }

        return armstrong == n ? true : false;
    }
}