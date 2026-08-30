class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        return dfs(s,wordDict, new HashMap<>());
    }
    // cache -> String, Boolean | can this string be 
    // made using wordDict
    public boolean dfs(String s, List<String> wordDict,
    Map<String, Boolean> cache) {
        if (s.isEmpty()) return true;
        if (cache.containsKey(s)) return cache.get(s);

        for (String w : wordDict) {
            if (s.startsWith(w)) {
                String sub = s.substring(w.length(),s.length());
                if (dfs(sub, wordDict, cache)) 
                    return true;
            }
        }

        cache.put(s, false);
        return false;
    }
}
