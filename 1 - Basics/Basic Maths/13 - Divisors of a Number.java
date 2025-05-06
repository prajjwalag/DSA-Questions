class Solution {
    public int[] divisors(int n) {
        List<Integer> arr = new ArrayList<Integer>();
        for(int i = 1; i <= n/2; i++) {
            if(n%i == 0) {
                arr.add(i);
            }
        }
        arr.add(n);
           int[] array = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            array[i] = arr.get(i); // Unbox Integer to int
        }

                return array;
    }
}