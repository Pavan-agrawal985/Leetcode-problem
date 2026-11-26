class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] arr= new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        int j=-1;
        int k=-1;
        int i=0;
        while(i<nums.length){
           
            if(map.containsKey(target-nums[i])){
                j=i;
                k=map.get(target-nums[i]);

                break;
            }
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }
            i++;
        }
        arr[0]=j;
        arr[1]=k;

        return arr;
        
    }
}