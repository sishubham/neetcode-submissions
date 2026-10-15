class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        for (int stone : stones)
            q.add(stone);

        while (q.size() > 1) {
            int s1 = q.poll();
            int s2 = q.poll();
            if (s1 == s2)
                continue;
            else
                q.add(Math.abs(s1-s2));
        }

        return q.size() > 0 ? q.poll() : 0;
    }
}
