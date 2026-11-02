class Solution {
    public int findPairs(int[] nums, int k) {

        HashSet <Integer> set=new HashSet<>();
        
        HashSet <Integer> d=new HashSet<>();

        for(int num: nums){
            if(set.contains(num)){
                d.add(num);
            }
            set.add(num);
        }
        if(k==0){
            return d.size();
        }
    int ct=0;
        for(int num: set){
            
                if(set.contains(num+k)){
                    ct++;
                }
                
        }
        return ct;
        
    }
}