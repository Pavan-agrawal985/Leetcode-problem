class Solution {
    public boolean rotateString(String s, String goal) {
        int j = 0;
        int i;

        char[] arr = s.toCharArray();
        while (j < s.length()) {
            char shift = arr[0];
            for (i = 1; i < s.length(); i++) {
                arr[i-1] = arr[i];
            }
            arr[s.length() - 1] = shift;
            j++;
            s = new String(arr);
            if (goal.equals(s))
                return true;
        }

        return false;
    }
}