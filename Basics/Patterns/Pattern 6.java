class Solution {
    public void pattern6(int n) {
        for(int i = n; i > 0; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
