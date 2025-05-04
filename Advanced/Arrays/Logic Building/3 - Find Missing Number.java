class Solution1UsingSumofNNumbers {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        int expectedSum = (size * (size+1))/2;
        int sum = 0;
        for(int i = 0; i < size; i++) {
            sum+=nums[i];
        }
        int missingNumber = expectedSum - sum;
        return missingNumber;
    }
}

class Solution2UsingXor {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        int expectedXorValue = 0;
        for(int  i = 1; i <= size; i++) {
            expectedXorValue^=i;
        }
        for(int i = 0; i < size; i++) {
            expectedXorValue ^= nums[i];
        }
        return expectedXorValue;
    }
}