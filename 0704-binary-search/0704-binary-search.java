class Solution {
    public int BS(int [] nums, int low , int high , int target){
        if(low>high) return -1;

        int mid=low+(high-low)/2;

        if(nums[mid]==target ) return mid;
        else if(nums[mid]>target) return BS(nums,low,mid-1,target);
        else return BS(nums,mid+1,high,target);


    }
    public int search(int[] nums, int target) {
        return BS(nums,0,nums.length-1,target);
        
        
    }
}