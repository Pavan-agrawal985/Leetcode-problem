class Solution {
    public int[] rearrangeArray(int nums[]){
        // Stack<Integer> stp=new Stack<>();
        // Stack<Integer> stn=new Stack<>();

        // for(int i=nums.length-1;i>=0;i--){
        //     if(nums[i]>0){
        //         stp.push(nums[i]);
        //     }
        //     else{
        //         stn.push(nums[i]);
        //     }
        // }
        
        // int i=0;
        // while(i<nums.length ){
        //    if(i%2 !=0 ){
        //     nums[i]=stn.pop();
        //    }
        //    else{
        //     nums[i] = stp.pop();
        //    }
        //    i++;
        // }

        // return nums;

        int[] result =new int[nums.length];

        int pos=0;
        int neg=1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                result[pos]=nums[i];
                pos+=2;
            }
            else{
                result[neg]=nums[i];
                neg+=2;
            }
        }

        return result;

    }
}