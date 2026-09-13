class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap <Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,i);
            }
        }
        int sum=0;
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(map.containsKey(ch)){
                int val=map.get(ch);
                sum+=Math.abs(val-i);
                
            }
        }


        return sum;
    }
}