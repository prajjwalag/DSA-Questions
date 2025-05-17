class Solution {
    public int subarraysWithXorK(int[] nums, int k) {
      int n = nums.length;
        int xr = 0;
        Map<Integer, Integer> mpp = new HashMap<>();
        // setting the value of 0.
        mpp.put(xr, mpp.getOrDefault(xr, 0) + 1);
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            // prefix XOR till index i:
            xr = xr ^ nums[i];

            // By formula: x = xr ^ k:
            int x = xr ^ k;

            // add the occurrence of xr ^ k to the count:
            cnt += mpp.getOrDefault(x, 0);

            // Insert the prefix xor till index i into the map:
            mpp.put(xr, mpp.getOrDefault(xr, 0) + 1);
        }
        return cnt;
    }
}