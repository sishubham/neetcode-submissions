class Solution {
    private static final String DEL = "\u2063";

    public String encode(List<String> strs) {
        if (strs.isEmpty()) return "EMPTY";
        
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s).append(DEL);
        }
        // Remove the trailing delimiter so an empty array vs an array with an empty string can be distinguished
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public List<String> decode(String str) {
        if (!str.isEmpty() && str.equals("EMPTY")) return List.of();
        if (str.isEmpty()) return List.of("");
        
        // Using -1 as the second argument ensures that trailing empty strings are not discarded
        String[] parts = str.split(DEL, -1);
        return Arrays.asList(parts);
    }
}