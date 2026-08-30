class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int sLength = s.length();
        boolean[] cache = new boolean[sLength + 1];
        cache[0] = true;

        for (int i = 1; i <= sLength; i++) {
            for (int j = i - 1; j >= 0; j--) {
                String sub = s.substring(j, i);
                if (cache[j] && wordDict.contains(sub))
                    cache[i] = true;
            }
        }

        return cache[sLength];
    }
}
