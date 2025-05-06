class Solution {
    public void pattern12(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for(int spaces = 0; spaces < (n-i)*2; spaces++) {
                System.out.print(" ");
            }
            for(int nums2 = i; nums2 >= 1; nums2--) {
                System.out.print(nums2);
            }
            System.out.println("");
        }
    }
}
