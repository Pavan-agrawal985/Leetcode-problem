class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }

        int [] res=new int[Math.min(nums1.length,nums2.length)];
        int i=0;

        for(int j=0;j<nums2.length;j++){
            if(map.getOrDefault(nums2[j],0)>0){
                res[i]=nums2[j];
                i++;

                map.put(nums2[j],map.get(nums2[j])-1);
            }
        }

        return Arrays.copyOf(res,i);
    }
   
}