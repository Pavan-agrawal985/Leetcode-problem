class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);

        int lastsmall=Integer.MIN_VALUE;
        int longest=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1==lastsmall){
                lastsmall=nums[i];
                count++;
            }
            else if (nums[i]!=lastsmall){
                count=1;
                lastsmall=nums[i];


            }
            longest=Math.max(longest,count);

        }
        
        return longest;


        
    }
}