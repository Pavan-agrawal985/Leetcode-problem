class Solution {
    public int max(int[] bd) {
        int max = 0;
        for (int i = 0; i < bd.length; i++) {
            max = Math.max(max, bd[i]);
        }

        return max;
    }

    public int min(int[] bd) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < bd.length; i++) {
            min = Math.min(min, bd[i]);
        }

        return min;
    }

    public int find(int[] bd, int mid, int k) {
        int ct = 0;
        int sum = 0;
        for (int i = 0; i < bd.length; i++) {

            if (bd[i] > mid) {
                sum += ct / k;
                ct = 0;
            } else {
                ct++;
            }

        }
        sum += ct / k;
        return sum;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length)
            return -1;
        int day = -1;
        int low = min(bloomDay);
        int high = max(bloomDay);

        while (low <= high) {
            int mid = (low + high) / 2;

            if (find(bloomDay, mid, k) >= m) {
                day = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return day;

    }
}