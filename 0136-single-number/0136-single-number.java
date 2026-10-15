class Solution {
    public int singleNumber(int[] nums) {
        // Arrays.sort(nums);
        // int single = 0;
        // int i = 0;
        // if (nums.length == 1)
        //     return nums[i];
        // while (i < nums.length - 1) {
        //     if (nums[i] != nums[i + 1]) {
        //         return nums[i];
        //     }

        //     else {
        //         i = i + 2;
        //     }
        // }
        // if (i == nums.length - 1)
        //     return nums[i];
        // return single;

        int xor=0;

        for(int i=0;i<nums.length; i++){
            xor=xor^nums[i];
        }
        return xor;

    }
}