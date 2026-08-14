class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int last_count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                
                count=0;
            }
            last_count=Math.max(last_count,count);
        }
        return last_count;
        
    }
}