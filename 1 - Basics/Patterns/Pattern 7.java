class Solution {
    public void pattern7(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = n; j > i; j-- ) {
                System.out.print(" ");
            }
            for(int k = 0; k < 2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
