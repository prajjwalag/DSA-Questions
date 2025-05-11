class Solution {
    public int[] findMissingRepeatingNumbers(int[] nums) {
        int n = nums.length;

        long expectedSum = (long)n * (n + 1)/2;
        long expectedSquareSum = (long)n * (n + 1) * (2 * n + 1)/6;

        long actualSum = 0;
        long actualSquareSum = 0;

        for(int i = 0; i < n; i++) {
            actualSum += nums[i];
            actualSquareSum += (long) nums[i] * (long)nums[i];
        }

        //Let X = Repeating
        //Let Y = Missing
        //ActualSum - ExpectedSum = X - Y
        long sumDifference = actualSum - expectedSum;

        //X^2 - Y^2 = (X-Y)(X+Y) = squareSumDifference
        long squareSumDifference = actualSquareSum - expectedSquareSum;

        // (X+Y) = squareSumDifference/(X-Y)
        long xPlusY = (long) squareSumDifference/sumDifference;


        long repeating = (long) (xPlusY + sumDifference)/2;
        long missing = (long) repeating - sumDifference;

        return new int[] {(int)repeating, (int)missing};

    }

}