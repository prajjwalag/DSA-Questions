class Solution {
    public void pattern11(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++ ) {
                if((i + j)%2 == 0) {
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }
    }
}
