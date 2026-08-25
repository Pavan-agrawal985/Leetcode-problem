class Solution {
  
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                map.put(ch,map.get(ch)+1);
            }
        }
        List<Map.Entry<Character,Integer>> list=new  ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        String str="";
        for(int i=0;i<list.size();i++){
            Map.Entry<Character, Integer> current = list.get(i);
            for(int j=0;j<current.getValue();j++){
                str+=current.getKey();
            }
        }
        

        return str;


    }
}