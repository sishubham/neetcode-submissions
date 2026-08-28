class Solution {
    public int lengthOfLIS(int[] nums) {
        HashMap<String, Integer> cache = new HashMap<>();
        return dfsHelper(nums, 0, -1, cache);
    }

    public int dfsHelper(int[] nums, int idx, int chosen,
        HashMap<String, Integer> cache) {
        if (idx == nums.length) return 0;
        String key = idx + "+" + chosen;

        if (cache.containsKey(key)) return cache.get(key);

        int Lis = dfsHelper(nums, idx+1, chosen, cache);

        if (chosen == -1 || nums[chosen] < nums[idx]) {
            Lis = Math.max(Lis, 1 + dfsHelper(nums, idx+1, idx, cache));
        }

        cache.put(key, Lis);
        return Lis;
    }
}
