class Solution {
    public void pattern20(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for(int k = 1; k <= (n-i)*2; k++) {
                System.out.print(" ");
            }
            for(int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i < n; i++) {
            for(int j = 1; j <= n-i; j++) {
                System.out.print("*");
            }
            for(int k = 1; k <= i*2; k++) {
                System.out.print(" ");
            }
            for(int l = 1; l <=n-i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
