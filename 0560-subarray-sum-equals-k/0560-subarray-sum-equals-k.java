class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap <Integer,Integer> map=new HashMap<>();

        map.put(0,1);

        int sum=0;
        int ct=0;
        int j=0;
        while( j<nums.length){
            sum+=nums[j];

            if(map.containsKey(sum-k)){
                ct+=map.get(sum-k);
            }

           
            map.put(sum,map.getOrDefault(sum,0)+1);
            
            j++;

        }
        return ct;
    }
}