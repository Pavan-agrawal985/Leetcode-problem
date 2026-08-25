class Solution {
    public int missingMultiple(int[] nums, int k) {
        int res=0;
        int j = 1;
        
        while (j < 1000) {
            boolean flag=false;
            for (int i = 0; i < nums.length; i++) {
                if(k*j==nums[i]){
                    flag=true;
                    break;   
                }
            }
            if(flag==true){
                j++;
            }
            else{
                return k*j;
            } 
        }
        return k*nums.length;
    }
}