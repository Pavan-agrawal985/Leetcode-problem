class Solution {
    public String reversePrefix(String word, char ch) {
        char [] c=word.toCharArray();
        boolean flag=false;
        int right=-1;
        int j=0;
        while(j<word.length()){
            if(c[j]==ch){
                right=j;
                flag=true;
                break;
            }
            j++;
            
           
        }
        if(flag==false) return word;
        int left=0;
        
        while(left<right){
            char temp=c[left];
            c[left]=c[right];
            c[right]=temp;
            left++;
            right--;
        }

        return new String(c);
    }
}