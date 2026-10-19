class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> res=new ArrayList<>();

        int i=0;

        while(i<nums1.length){
            int num=nums1[i];

            int count1=0;

            while(i<nums1.length && nums1[i]==num){
                count1++;
                i++;
            }

            int first=lowerBound(nums2,num);
            int last=upperBound(nums2,num);

            int count2=last-first;

            int count=Math.min(count1,count2);

            for(int j=0;j<count;j++){
                res.add(num);
            }

        }

        int [] ans=new int[res.size()];
        for(int j=0;j<ans.length;j++){
            ans[j]=res.get(j);
        }

        return ans;
        
    }
    public int upperBound(int[] nums, int x) {
        int low=0;
        int high=nums.length-1;
        int ans =nums.length;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[mid]>x){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        return ans;
    }
    public int lowerBound(int[] nums, int x) {
        int ans=nums.length;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;

        if(nums[mid]>=x){
            ans=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
        }
        
       return ans;
     }
}