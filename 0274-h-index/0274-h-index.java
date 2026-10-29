class Solution {
    public int find(int[] citations, int mid){
        int ct=0;
        for(int num: citations){
            if(num>=mid){
                ct++;
            }
        }

        return ct;
    }
    public int hIndex(int[] citations) {
        int low=0;
        int high=citations.length;

       
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;

            if(find(citations, mid)>=mid) {
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
}