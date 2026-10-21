class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int minHour = 1;
        int maxHour = -1;
        for (int p : piles) maxHour = Math.max(p, maxHour);
        int optimalMinHour = Integer.MAX_VALUE;

        while(minHour <= maxHour) {
            int mid = minHour + (maxHour-minHour)/2;
            if (hoursTakenEating(piles, mid) <= h) {
                optimalMinHour = mid;
                maxHour = mid-1;
            } else {
                minHour = mid+1;
            }
        }

        return optimalMinHour;
    }

    int hoursTakenEating(int[] piles, double hours) {
        int totalTime = 0;
        for (int p : piles) {
            totalTime += Math.ceil(p/hours);
        }
        return totalTime;
    }
}
