class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        int max = 0;
        boolean flag = false;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                if(flag){
                    return false;
                }
                flag=true;
                // Try deleting left character
                int left = i + 1;
                int right = j;

                while (left < right &&
                       s.charAt(left) == s.charAt(right)) {
                    left++;
                    right--;
                }

                if (left >= right) {
                    return true;
                }

                // Try deleting right character
                left = i;
                right = j - 1;

                while (left < right &&
                       s.charAt(left) == s.charAt(right)) {
                    left++;
                    right--;
                }

                return left >= right;
            }
           
                i++;
                j--;
            
            

        }
        
        return true;

    }
}