class MinStack {
    Stack<Long> st;
    long min;

    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int value) {

        if (st.isEmpty()) {
            st.push((long)value);
            min = value;
        }
        else {
            if (value < min) {
                st.push(2L * value - min);
                min = value;
            }
            else {
                st.push((long)value);
            }
        }
    }
    
    public void pop() {

        long n = st.peek();

        if (n < min) {
            min = 2L * min - n;
        }

        st.pop();
    }

    public int top() {

        long n = st.peek();

        if (n < min) {
            return (int)min;
        }

        return (int)n;
    }
    
    public int getMin() {
        return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */