class Solution {
    public void reverse(char[] str, int s,int e){
        if(s>=e){
            return;
        }

        char temp=str[s];
        str[s]=str[e];
        str[e]=temp;
        reverse(str,s+1,e-1);
    }
    public void reverseString(char[] s) {
        reverse(s,0,s.length-1);

       
    
    }
}