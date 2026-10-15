class Solution {
    public int minBitFlips(int start, int goal) {
        int r=start ^ goal ;
        int ct=0;
        while(r>0){
            if(r%2 !=0){
                ct++;
            }
            r/=2;

        }

        return ct;
        
    }
}