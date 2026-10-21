class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int minHour = 1;
        int maxHour = Arrays.stream(piles).max().getAsInt();

        while(minHour < maxHour) {
            int mid = (maxHour + minHour)/2;
            if (hoursTakenEating(piles, mid) <= h) {
                maxHour = mid;
            } else {
                minHour = mid+1;
            }
        }

        return minHour;
    }

    int hoursTakenEating(int[] piles, double hours) {
        int totalTime = 0;
        for (int p : piles) {
            totalTime += Math.ceil(p/hours);
        }
        return totalTime;
    }
}
