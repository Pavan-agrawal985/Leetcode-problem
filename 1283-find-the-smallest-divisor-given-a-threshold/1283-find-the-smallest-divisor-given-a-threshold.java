class Solution {
    public int max(int[] nums) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }

        return max;
    }

    public int ceil(int a, int b) {
        if (a % b == 0)
            return a / b;
        else
            return ((int) a / b) + 1;
    }

    public int sum(int [] nums,int l){
         int sum=0;

            for(int i=0;i<nums.length;i++){
                sum+=ceil(nums[i],l);
            }
            return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int ans = -1;
        int low = 1;
        int high = max(nums);
        while (low <= high) {
            int mid = (low + high) / 2;

            if (sum(nums, mid) <= threshold) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        

        return ans;

    }
}