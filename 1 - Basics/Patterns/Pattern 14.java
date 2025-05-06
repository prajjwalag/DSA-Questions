class Solution {
    public void pattern14(int n) {
        for(int i = 0; i < n; i++) {
            char ch = 'A';
            for(int j = 0; j <= i; j++) {
                
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
}
