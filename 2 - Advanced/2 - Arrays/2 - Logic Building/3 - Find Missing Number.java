
/*
Approach 1:
1. Initialize two variables xor1, xor2 as 0. xor1 variable will calculate the XOR of 1 to N
2. Calculate the XOR of all the elements in the array by xor2 = xor2 ^ arr[i]..
3. Finally, the answer will be the XOR of xor1 and xor2.
*/


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


/*
Approach 2 :

1. Initialize two variables xor1, xor2 as 0. xor1 variable will calculate the XOR of 1 to N
2. Calculate the XOR of all the elements in the array by xor2 = xor2 ^ arr[i]..
3. Finally, the answer will be the XOR of xor1 and xor2.
*/
class Solution2UsingXor {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedXor = 0;
        int actualXor = 0;
        for(int i = 0; i < n; i++ ) {
          expectedXor ^= i+1;
          actualXor ^= nums[i];
        }
        int missingXor = actualXor ^ expectedXor;
        return missingXor;
    }
}
