class Solution {
    public String removeOuterParentheses(String s) {
        
        String str="";
        int level=0;

        
        for(int i=0; i< s.length();i++){
            if(s.charAt(i)=='('){
                level++;
                if(level>1){
                    str+=s.charAt(i);
                }
            }else{
                level--;
                if(level>0){
                    str+=s.charAt(i);
                }
            }
        }
        return str;
    }
}