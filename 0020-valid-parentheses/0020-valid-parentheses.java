class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int i = 0;

        while (i < s.length()) {

            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));

            } else {
                if (stack.empty())
                    return false;

                if ((stack.peek() == '(' && s.charAt(i) == ')') || (stack.peek() == '[' && s.charAt(i) == ']')
                        || (stack.peek() == '{' && s.charAt(i) == '}')) {
                    stack.pop();

                } else {
                    return false;
                }

            }
            i++;

        }
        if (stack.empty())
            return true;
        else
            return false;

    }
}