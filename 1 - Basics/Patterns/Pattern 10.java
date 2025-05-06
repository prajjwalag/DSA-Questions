class Solution {
    public void pattern10(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i <= n; i++) {
            for(int j = n-i; j > 0; j-- ) {
                System.out.print("*");
            }
            if(i != n)
                System.out.println();
        }
    }
}
