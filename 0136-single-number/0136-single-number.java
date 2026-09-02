class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
       int single =0;
       int i=0;
       if (nums.length==1) return nums[i];
       while(i<nums.length-1){
         if(nums[i]!=nums[i+1]){
            single=nums[i];
            i++;
         }
         
         else{
            i=i+2;
         }
       }
       if(i==nums.length-1) return nums[i];
       return single;

        
    }
}