class Solution {
    public int strStr(String haystack, String needle) {
        int start = 0;
        int end = 0;

        String s = "";
        while (end < haystack.length()) {
            s = s + haystack.charAt(end);
            if (end - start + 1 > needle.length()) {
                s = s.substring(1);
                start++;
            }

            if (end - start + 1 == needle.length()) {
                if (s.equals(needle)) {
                    return start;
                }
            }

            end++;

        }
        return -1;
    }
}