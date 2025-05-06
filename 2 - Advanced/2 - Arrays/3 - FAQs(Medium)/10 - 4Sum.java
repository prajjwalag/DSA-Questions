class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i = 0; i < n-3; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1; j < n-2; j++) {
                if(j > i+1 && nums[j] == nums[j-1]) continue;

                int k = j+1;
                int l = n-1;
                while(k < l) {
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if(sum < target) {
                        k++;
                    } else if (sum > target) {
                        l--;
                    } else {
                        List<Integer> quadruplet = new ArrayList<>();
                        quadruplet.add(nums[i]);
                        quadruplet.add(nums[j]);
                        quadruplet.add(nums[k]);
                        quadruplet.add(nums[l]);

                        answer.add(quadruplet);

                        k++;
                        l--;

                        while(k < l && nums[k] == nums[k-1]) k++;
                        while(k < l && nums[l] == nums[l+1]) l--;
                    }
                }
            }
        }
        return answer;
    }
}