class Solution {
    public int maxArea(int[] heights) {
        int start = 0;
        int end = heights.length - 1;

        int max_water = 0;

        while (start <= end) {
            int smallerHeight = 0;
            if (heights[end] >= heights[start]) {
                smallerHeight = heights[start];
                start++;
            } else {
                smallerHeight = heights[end];
                end--;
            }
            max_water = Math.max(max_water, smallerHeight*(end-start+1));
        }

        return max_water;
    }
}
