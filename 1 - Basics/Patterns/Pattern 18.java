class Solution {
    public void pattern18(int n) {
        for(int i = 0; i < n; i++) {
            char ch = (char)('A'+n-i-1);
            for(int j = 0; j <= i; j++) {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }
}
