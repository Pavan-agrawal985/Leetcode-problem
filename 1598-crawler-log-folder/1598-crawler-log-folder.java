class Solution {
    public int minOperations(String[] logs) {
        // Stack<String> st = new Stack<>();
        // for (int i = 0; i < logs.length; i++) {
        //     if (logs[i].equals("./")) {
        //         continue;
        //     } else if (logs[i].equals("../")) {
        //         if (!st.isEmpty()) {
        //             st.pop();
        //         } else {
        //             continue;
        //         }
        //     } else {
        //         st.push(logs[i]);
        //     }
        // }
        // return st.size();

        int count=0;
        for (int i = 0; i < logs.length; i++){
             if (logs[i].equals("./")) {
                continue;
            }
             if (logs[i].equals("../")) {
                if (count>0) {
                    count--;
                } 
            } else {
              count++;
            }
        }

        return count;
    }
}