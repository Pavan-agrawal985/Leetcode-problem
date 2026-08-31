class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = map.get(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == 'V' || s.charAt(i)=='X') {
                if (s.charAt(i-1) == 'I') {
                    sum += (map.get(s.charAt(i)) - 2*map.get(s.charAt(i-1)));
                } else {
                    sum += map.get(s.charAt(i));
                }

            }
            else if (s.charAt(i) == 'L' || s.charAt(i)=='C') {
                if (s.charAt(i-1) == 'X') {
                    sum += (map.get(s.charAt(i)) - 2*map.get(s.charAt(i-1)));
                } else {
                    sum += map.get(s.charAt(i));
                }

            }
            else if (s.charAt(i) == 'D' || s.charAt(i)=='M') {
                if (s.charAt(i-1) == 'C') {
                    sum += (map.get(s.charAt(i)) - 2*map.get(s.charAt(i-1)));
                } else {
                    sum += map.get(s.charAt(i));
                }

            }
            else{
                sum += map.get(s.charAt(i));
            }

        }
        return sum;
    }
}