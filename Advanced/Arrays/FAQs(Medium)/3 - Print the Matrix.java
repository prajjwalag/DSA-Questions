class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1; 

        List<Integer> result = new ArrayList<>();

        while(top <= bottom && left <= right) {
            // Step 1: Adding Top Elements
            for(int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            //Step 2: Adding Right Side Elements
            for(int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            //Step 3: Adding Bottom Side Elements only if any row is pending
            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            //Step 4: Adding Left Side Elements only if any column is pending
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
             left++;
            }
        }
        return result;
    }
}