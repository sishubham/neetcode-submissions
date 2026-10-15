class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int start = 0;
        for ( int end=0; end < nums.length; end++ ) {
            if (nums[end] == 0)
                start = end+1;
            maxOnes = Math.max(maxOnes, end-start+1);
        }
        return maxOnes;
    }
}