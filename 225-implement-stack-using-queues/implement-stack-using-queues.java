

  class MyStack {
    private Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }

    // Push element x onto stack.
    public void push(int x) {
        q.offer(x); // push at the back
        int size = q.size();
        // rotate the queue so that new element is at the front
        for (int i = 0; i < size - 1; i++) {
            q.offer(q.poll());
        }
    }

    // Removes the element on top of the stack and returns it.
    public int pop() {
        return q.poll();
    }

    // Get the top element.
    public int top() {
        return q.peek();
    }

    // Returns whether the stack is empty.
    public boolean empty() {
        return q.isEmpty();
    }
 

}


/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */