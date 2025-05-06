class Solution {
    public int[] pascalTriangleII(int r) {
        
        int[] result = new int[r];
        for(int i= 0; i < r; i++) {
            if(i == 0 || i == r-1) {
                result[i] = 1;
            } else if(i == 1 || i == r - 2) {
                result[i] = r-1;
            } else {
                result[i] = (result[i-1]*(r-i))/i;
            }
        }
        return result;
    }
}