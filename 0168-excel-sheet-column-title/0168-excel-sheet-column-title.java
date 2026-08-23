class Solution {
    public String convertToTitle(int columnNumber) {
        String res="";
        int n=columnNumber;
        while(n>0){
            n--;
            int r=n%26;
            
            res+=(char) (r+'A');
            
            n/=26;
            
        }
        
        return new StringBuilder(res).reverse().toString();
    }
}