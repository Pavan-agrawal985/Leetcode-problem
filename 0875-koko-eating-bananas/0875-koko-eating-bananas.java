class Solution {
    public int max(int [] piles){
        int max=0;
        for(int i=0;i<piles.length;i++){
             max=Math.max(max,piles[i]);
        }

        return max;
    }
    public int ceil(int a, int b) {
        if (a % b == 0)
            return a / b;
        else
            return ((int) a / b) + 1;
    }
    public long find(int[] piles, int mid){
        long sum = 0;
        for(int i=0;i<piles.length;i++){
            sum += ((long) piles[i] + mid - 1) / mid;
        }
        return sum;

    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=max(piles);
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;

            if(find(piles,mid)<=h){
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