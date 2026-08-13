class Solution {
    public int reverse(int x) {
        int temp = x;
        long  res = 0 ;
        long  l = Math.abs((long)x);
        while (l > 0) {
            res *= 10;
            res += l % 10;
            l /= 10;
        }

        if (temp >= 0)
            res = res ;
        else
            res = -res ;

        

        if (Integer.MIN_VALUE>res || res> Integer.MAX_VALUE)
            return 0;
        else
            return (int)res;

    }
}