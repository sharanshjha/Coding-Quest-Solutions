class MyStack {
    private Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }
    
    public void push(int x) {
        queue.add(x);
        for (int i = 1; i < queue.size(); i++) {
            queue.add(queue.remove());
        }
    }
    
    public int pop() {
        if (empty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return queue.remove();
    }
    
    public int top() {
        if (empty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}