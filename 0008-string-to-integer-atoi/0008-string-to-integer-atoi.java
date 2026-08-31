class Solution {
    public int myAtoi(String s) {
       int n=s.length();
       int i=0;
       while(i<n && s.charAt(i)==' '){
            i++;
       }

       boolean flag=true;
       if(i<n && s.charAt(i)=='-'){
            flag=false;
            i++;
       }
       else if (i < n && s.charAt(i) == '+') {
            i++;
        }

        int res=0;

        

        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {

            int digit = s.charAt(i) - '0';

            // 4. Check overflow
            if (res > (Integer.MAX_VALUE - digit) / 10) {
                if (flag) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }

            res = res * 10 + digit;
            i++;
        }

        // 5. Apply sign
        if (!flag) {
            res = -res;
        }

        return res;
    }
}