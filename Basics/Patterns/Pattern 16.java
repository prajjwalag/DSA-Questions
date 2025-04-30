class Solution {
    public void pattern16(int n) {
        char ch = 'A';
        for(int i = 0; i < n; i++, ch++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(ch);

            }
            System.out.println();
        }
    }
}
