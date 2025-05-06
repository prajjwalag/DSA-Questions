class BruteForceSolution {
    public void rotateMatrix(int[][] matrix) {
       int[][] resultMatrix = new int[matrix.length][matrix[0].length];

        for(int i = 0, oi = matrix[0].length-1; i < matrix.length; i++, oi--) {
            for(int j = 0, oj = 0; j < matrix[0].length; j++, oj++) {
                resultMatrix[oj][oi] = matrix[i][j];
            }
        }

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = resultMatrix[i][j];
            }
        }
    }
}

class OptimalSolution {
    public void swap(int[][] matrix, int rowIndex1, int colIndex1, int rowIndex2, int colIndex2) {
        int temp = matrix[rowIndex1][colIndex1];
        matrix[rowIndex1][colIndex1] = matrix[rowIndex2][colIndex2];
        matrix[rowIndex2][colIndex2] = temp;
    }

    public void transposeMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < i; j++) {
                swap(matrix, i, j, j, i);
            }
        }
    }

    public void reverseRow(int[][] matrix, int row) {
        int left = 0;
        int right = matrix[row].length-1;

        while(left < right) {
            swap(matrix, row, left, row, right);
            left++;
            right--;
        }
    }

    public void rotateMatrix(int[][] matrix) {
        //Step 1: Transpose the matrix
        transposeMatrix(matrix);

        //Step 2: Reverse Each row of the matrix
        for(int i = 0; i < matrix.length; i++) {
            reverseRow(matrix, i);
        }
    }
}