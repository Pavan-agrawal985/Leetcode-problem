class Solution {
    public String reverseVowels(String s) {
        Set<Character> set=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        int i=0;
        int j=s.length()-1;
        char[] arr = s.toCharArray();
        while(i<j){
            if(set.contains(s.charAt(i)) && set.contains(s.charAt(j))){
                char ch=arr[i];
                arr[i]=arr[j];
                arr[j]=ch;
                i++;
                j--;
            }
            else if(set.contains(s.charAt(i))){
                j--;
            }
            else {
                i++;
            }
        }
        return new String(arr);
    }
}