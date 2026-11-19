class Solution {
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch : s.toCharArray()){
            int  c=ch-'0';
            if(c>=0 && c<=9){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }

        String str="";
        while(!st.isEmpty()){
            str=str+st.pop();
        }

        return new StringBuilder(str).reverse().toString();
        
    }
}