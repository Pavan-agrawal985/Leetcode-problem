class Solution {
    public int maxProduct(int[] nums) {
        int largest=Integer.MIN_VALUE;

        int pr=1;
        for(int i=0;i<nums.length;i++){
            pr*=nums[i];
            largest=Math.max(largest,pr);

            if(pr==0){
                pr=1;
            }
        }
        pr=1;
        for(int i=nums.length-1;i>=0;i--){
            pr*=nums[i];
            largest=Math.max(largest,pr);

            if(pr==0){
                pr=1;
            }
        }
        return largest;
        
    }
}