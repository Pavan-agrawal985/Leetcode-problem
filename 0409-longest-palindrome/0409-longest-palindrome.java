class Solution {
    public int longestPalindrome(String s) {
        // HashMap<Character, Integer> map = new HashMap<>();

        // for (int i = 0; i < s.length(); i++) {
        //     char ch = s.charAt(i);
        //     if (map.containsKey(ch)) {
        //         map.put(ch, map.get(ch) + 1);
        //     } else {
        //         map.put(ch, 1);
        //     }
        // }
        // int longest = 0;
        // boolean odd = false;
        // for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        //     longest += (entry.getValue() / 2) * 2;
        //     if (entry.getValue() % 2 != 0) {
        //         odd = true;
        //     }

        // }

        // if (odd) {
        //     longest++;
        // }

        int [] arr=new int[128];

        for(char ch : s.toCharArray()){
            arr[ch]++;
        }

        int longest=0;

        for(int count:arr){
            longest+=(count/2)*2;
        }
        
        if(longest<s.length()){
            longest++;
        }
        return longest;
    }
}