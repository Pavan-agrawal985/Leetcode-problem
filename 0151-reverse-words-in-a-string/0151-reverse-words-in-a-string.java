class Solution {
    public String reverseWords(String s) {
        String str="";
        int i =s.length()-1;
        while(i>=0){
            // char ch=s.charAt(i);
            if(s.charAt(i)==' '){
                i--;
                continue;
            }

            String subs="";
            while(i>=0 &&s.charAt(i) != ' '){
                subs+=s.charAt(i);
                i--;

            }
            str+=new StringBuilder(subs).reverse().toString();
            str+=" ";

            
        }
        return str.substring(0,str.length()-1);
        
    }
}