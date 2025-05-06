class Solution {
    public void pattern22(int n) {
        for(int i = 1; i < (n*2); i++) {
            for(int j = 1; j < (n*2); j++) {
                int up = i-1;
                int down = n*2-i-1;
                int left = j-1;
                int right = n*2-j-1;    
                int min = Math.min(Math.min(left, right), Math.min(up, down));

                System.out.print(n-min + " ");
            }
            System.out.println();
        }
    }
}
