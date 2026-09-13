class Solution {
    public char findTheDifference(String s, String t) {
        char res='0';
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                int val=map.get(ch);
                map.put(ch,val+1);
            }
            else{
                map.put(ch,1);
            }
        }

        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(map.containsKey(ch) && map.get(ch) > 0){
                int val=map.get(ch);
                map.put(ch,val-1);
            }
            else {
                res=ch;
            }
        }

        return res;
    }
}