class Solution {
    public String removeDuplicates(String s) {
        // characters store karne ke liye stack
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (st.isEmpty()) {
                // Stack khali hai toh seedha push karo
                st.push(s.charAt(i));
            } else if (st.peek() != s.charAt(i)) {
                // Top character alag hai, toh push karo
                st.push(s.charAt(i));
            } else {
                // Top character match kar gaya, toh pop kar do
                st.pop();
            }
        }
        // Stack ke bache hue characters ko StringBuilder mein nikalo (reverse order mein aayenge)
        StringBuilder str = new StringBuilder();
        while (!st.isEmpty()) {
            str.append(st.peek());
            st.pop();
        }
        // Reverse karke sahi order mein String return karo
        return str.reverse().toString();
    }
}
