class Solution {
    public int longestOnes(int[] nums, int k) {
        //Sliding window, windowLen - no of 1 = no of 0s
        int ones = 0;
        int start = 0;
        int maxLen = 0;
        for ( int end=0; end<nums.length; end++ ) {
            if (nums[end] == 1) ones++;
            while (end-start+1 - ones > k) {
                if (nums[start++] == 1) ones--;
            }
            maxLen = Math.max(end-start+1, maxLen);
        }
        return maxLen;
    }
}