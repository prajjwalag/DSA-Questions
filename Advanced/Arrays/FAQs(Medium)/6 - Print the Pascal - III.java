class Solution {
    public List<List<Integer>> pascalTriangleIII(int n) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            List<Integer> rowValues = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
                if(j == 0 || i == j) {
                    rowValues.add(1);
                } else {
                    rowValues.add(pascalTriangle.get(i-1).get(j-1) + pascalTriangle.get(i-1).get(j));
                }
            }
            pascalTriangle.add(rowValues);
        }
        return pascalTriangle;
    }
}