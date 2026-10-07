class Solution {
    public int lengthOfLongestSubstring(String s) {

        int len = s.length();
        if (s.isEmpty() || len == 0) return 0;

        int start = 0;
        Set<Character> chars = new HashSet<>();
        int maxLen = 0;

        for ( int end=0; end<len; end++ ) {
            char curr = s.charAt(end);
            //If set contains char
            while(start < end && chars.contains(curr)) {
                chars.remove(s.charAt(start));
                start++;
            }
            //If set doesn't contains it
            chars.add(curr);
            maxLen = Math.max(maxLen, end-start+1);
        }

        return maxLen;
    }
}
