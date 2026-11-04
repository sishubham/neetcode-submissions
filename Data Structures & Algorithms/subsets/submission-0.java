class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(0, nums, res, new ArrayList());
        return res;
    }

    private void helper(int idx, int[] nums, List<List<Integer>> res, List<Integer> ls) {
        if (idx > nums.length)
            return;
        if (idx == nums.length) {
            res.add(new ArrayList(ls));
            return;
        }

        ls.add(nums[idx]);
        helper(idx+1, nums, res, ls);

        ls.remove(ls.size()-1);
        helper(idx+1, nums, res, ls);
    }
}
