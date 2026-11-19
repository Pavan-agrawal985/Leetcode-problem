class Solution {
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch : s.toCharArray()){
            int  c=ch-'0';
            if(c>=0 && c<=9){
                if(!st.isEmpty()){
                    st.pop();
                }
                
            }
            else{
                st.push(ch);
            }
        }

        StringBuilder str=new StringBuilder();
        while(!st.isEmpty()){
            str.append(st.pop());
        }

        return str.reverse().toString();
        
    }
}