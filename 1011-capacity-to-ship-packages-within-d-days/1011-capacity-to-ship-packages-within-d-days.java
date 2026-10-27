class Solution {

    public int days(int [] weights , int cap){
        int day=1; int load=0;

        for(int num: weights){
            if(load+num>cap){
                day++;
                load=num;

            }
            else{
                load+=num;
            }
        }

        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        int sum=0;
        for(int num: weights){
            max=Math.max(num,max);
            sum+=num;

        }

        int low=max;
        int high=sum;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;

            if(days(weights,mid)<=days){
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