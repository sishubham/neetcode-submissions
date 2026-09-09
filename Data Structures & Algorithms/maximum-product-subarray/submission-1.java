class Solution {
    public int maxProduct(int[] nums) {
        
        int g_max = Integer.MIN_VALUE;
        int maxP = 1, minP = 1;

        for (int i : nums) {
            if (i<0) {
                int temp = maxP;
                maxP = minP;
                minP = temp;
            }
            maxP = Math.max(i, maxP*i);
            minP = Math.min(i, minP*i);
            g_max = Math.max(g_max, maxP);
        }

        return g_max;
    }
}
