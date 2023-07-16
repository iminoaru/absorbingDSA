https://leetcode.com/problems/implement-queue-using-stacks/submissions/995686459/

// Insert efficient implementation.

class MyQueue {
    Stack<Integer> main;
    Stack<Integer> helper;

    public MyQueue() {
        main = new Stack<>();
        helper = new Stack<>();
    }
    
    public void push(int x) {
        main.push(x);
    }
    
    public int pop() {
        while(!main.isEmpty()){
            helper.push(main.pop());
        }

        int popped = helper.pop();

        while(!helper.isEmpty()){
            main.push(helper.pop());
        }

        return popped;
    }
    
    public int peek() {
        while(!main.isEmpty()){
            helper.push(main.pop());
        }

        int peeked = helper.peek();

        while(!helper.isEmpty()){
            main.push(helper.pop());
        }

        return peeked;
    }
    
    public boolean empty() {
        return main.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
