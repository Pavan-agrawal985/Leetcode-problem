class Solution {
    public String reverseOnlyLetters(String s) {
        int i=0;
        int j=s.length()-1;
        char [] arr=s.toCharArray();
        while(i<j){
            
            if(((arr[i] >= 'A' && arr[i] <= 'Z') ||
            (arr[i] >= 'a' && arr[i] <= 'z'))&&((arr[j] >= 'A' && arr[j] <= 'Z') ||
            (arr[j] >= 'a' && arr[j] <= 'z'))){
                char ch = arr[i];
            arr[i] = arr[j];
            arr[j] = ch;
                i++;
                j--;

            }
            else if(((arr[i] >= 'A' && arr[i] <= 'Z') ||
            (arr[i] >= 'a' && arr[i] <= 'z'))){
                j--;
            }
            else if(((arr[j] >= 'A' && arr[j] <= 'Z') ||
            (arr[j] >= 'a' && arr[j] <= 'z'))){
                i++;
            }
            else {i++;
            j--;}
        }

        return new String(arr);
        
    }
}