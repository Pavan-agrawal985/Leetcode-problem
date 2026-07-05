class Solution {
    public int addDigits(int num) {
        while (num >= 10) {
            int sumDigits = 0;
            while (num > 0) {
                sumDigits += num % 10;
                num /= 10;
            }
            num = sumDigits; // Loop again with the new sum
        }
        return num;
 
    }
}