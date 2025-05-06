class Solution {
    public ArrayList<Integer> leaders(int[] nums) {
        ArrayList<Integer> leaders = new ArrayList<>();

        for(int i = nums.length-1; i>=0 ; i--) {
            if(leaders.isEmpty() || leaders.get(leaders.size()-1) < nums[i]) {
                leaders.add(nums[i]);
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }
}