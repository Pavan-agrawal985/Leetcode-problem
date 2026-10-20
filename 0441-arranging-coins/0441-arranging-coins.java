class Solution {
    public int arrangeCoins(int n) {
        // int i = 1;
        // int count = 0;
        // while (n > 0) {
        //     if (n >= i) {
        //         count++;
        //     }
        //     n -= i;
        //     i++;
        // }
        // return count;

        return (int) (Math.sqrt(2*(long)n+0.25)-0.5);
    }
}