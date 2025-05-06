class Solution {
    public void pattern19(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            for(int k = 0; k < i*2; k++) {
                System.out.print(" ");
            }
            for(int l = 0; l < n-i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for(int k = 0; k < (n-i-1)*2; k++) {
                System.out.print(" ");
            }
            for(int l = 0; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
