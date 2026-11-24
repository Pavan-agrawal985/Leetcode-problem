class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < operations.length; i++) {
            if (!st.isEmpty() && operations[i].equals("C")) {
                st.pop();
            } else if (!st.isEmpty() && operations[i].equals("D")) {
                int val = st.peek();
                st.push(val * 2);
            } else if (!st.isEmpty() && st.size() > 1 && operations[i].equals("+")) {
                int val1 = st.pop();
                int val2 = st.pop();
                st.push(val2);
                st.push(val1);
                st.push(val1 + val2);
            }

            else {
                int number = Integer.parseInt(operations[i]);
                st.push(number);
            }

        }

        int sum = 0;
        while (!st.isEmpty()) {
            sum += st.pop();
        }
        return sum;

    }
}