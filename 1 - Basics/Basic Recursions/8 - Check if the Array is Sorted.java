class Solution {
    public boolean isSorted(ArrayList<Integer> nums) {
        //your code goes here
        return checkSorting(nums, 0);
    }
    public boolean checkSorting(ArrayList<Integer> nums, int i) {
        if(nums.size() == 1 || (i >= nums.size()-2 && nums.size()>2)) {
            return true;
        }
        if(nums.get(i) > nums.get(i+1)) {
            return false;
        } 
        return checkSorting(nums, i+1);
    }
}