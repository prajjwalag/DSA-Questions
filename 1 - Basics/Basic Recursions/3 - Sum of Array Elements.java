class Solution {
    public int arraySum(int[] nums) {
        //your code goes here
		return calculateSum(nums, 0);
    }
	public int calculateSum(int[] nums, int i) {
		if(i >= nums.length) {
			return 0;
		}
		
		return nums[i]+calculateSum(nums, ++i);
	}
}