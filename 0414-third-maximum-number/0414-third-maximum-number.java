class Solution {
    public int thirdMax(int[] nums) {
        int fmax=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        int tmax=Integer.MIN_VALUE;
        boolean found=false;

        for(int num : nums){
            fmax=Math.max(fmax,num);
        }
        for(int num : nums){
            if(num!=fmax){
                smax=Math.max(smax,num);
            }
            
        }
        for(int num : nums){
            if(num!=fmax && num != smax){
                tmax=Math.max(tmax,num);
                found=true;
            }
            
        }
        if(!found){
            return fmax;
        }
        
        return tmax;
    }
}