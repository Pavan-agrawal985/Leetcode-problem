class Solution {
    public int titleToNumber(String columnTitle) {
        int res=0;
        int n=columnTitle.length();
        int i=0;

        while(i<n){
            int r= (columnTitle.charAt(i)-'A' +1 );
            res+=r;
            i++;
            if(i>=n){
                return res;
            }
            else{
                res*=26;
            }
            
            
            

        }
        return res;
    }
}