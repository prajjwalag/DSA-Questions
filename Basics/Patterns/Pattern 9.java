class Solution {
    public void pattern9(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = n; j > i; j-- ) {
                System.out.print(" ");
            }
            for(int k = 0; k < 2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int k = (n-i)*2-1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
