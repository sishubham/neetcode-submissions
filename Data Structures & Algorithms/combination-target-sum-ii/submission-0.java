class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        var res = new ArrayList<List<Integer>>();
        var ls = new ArrayList<Integer>();
        Arrays.sort(candidates);
        helper(candidates, target, 0, 0, res, ls);
        return res;
    }

    private void helper(
        int[] nums, int target, int currSum, int idx, List<List<Integer>> res, List<Integer> ls) {
        if (target == currSum) {
            res.add(new ArrayList<Integer>(ls));
            return;
        }
        if (idx >= nums.length || currSum > target)
            return;

        ls.add(nums[idx]);
        helper(nums, target, currSum + nums[idx], idx + 1, res, ls);
        ls.remove(ls.size() - 1);
        while (idx < nums.length-1 && nums[idx] == nums[idx+1]) idx++;
        helper(nums, target, currSum, idx + 1, res, ls);
    }
}
