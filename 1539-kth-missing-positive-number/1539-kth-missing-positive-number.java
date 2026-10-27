class Solution {
    public int findKthPositive(int[] arr, int k) {
        int r=k;
        for(int num: arr){
            if(num<=r){
                r++;
            }
            
        }
        return r;
    }
}