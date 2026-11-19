class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> st =new Stack<>();
        boolean flag=false;
        int i;
        for(i=0;i<word.length();i++){
            char c=word.charAt(i);
            st.push(c);
            if(ch==c){
                flag=true;
                break;
            }

        }
        if(flag==false) return word;
        String str="";
        while(!st.isEmpty()){
            str=str+st.pop();
        }
        str=str+word.substring(i+1);

        return str;
        
    }
}