class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int i = 0;
        while (i < nums.length) {
            int c=target-nums[i];

            if (map.containsKey(c)) {
               return new int[]{map.get(c),i};
            }
            
                map.put(nums[i], i);
            
            i++;
        }
        

        return new int[]{-1,-1};

    }
}