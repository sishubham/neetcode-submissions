class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        var res = new ArrayList<List<Integer>>();
        var ls = new ArrayList<Integer>();
        helper(nums, nums.length - 1, target, res, ls);
        return res;
    }

    private void helper(
        int[] nums, int idx, int target, List<List<Integer>> res, List<Integer> ls) {
        if (target < 0 || idx < 0)
            return;
        if (target == 0) {
            res.add(new ArrayList<>(ls));
            return;
        }
        ls.add(nums[idx]);
        helper(nums, idx, target - nums[idx], res, ls);
        ls.remove(ls.size() - 1);
        helper(nums, idx - 1, target, res, ls);
    }
}
