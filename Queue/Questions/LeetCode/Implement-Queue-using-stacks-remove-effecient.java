https://leetcode.com/problems/implement-queue-using-stacks/submissions/995686459/

// Remove effecient Implementation.

 class MyQueue {
    Stack<Integer> main;
    Stack<Integer> helper;

    public MyQueue() {
        main = new Stack<>();
        helper = new Stack<>();
    }
    
    public void push(int x) {
        while(!main.isEmpty()){
            helper.push(main.pop());
        }

        main.push(x);

        while(!helper.isEmpty()){
            main.push(helper.pop());
        }
    }
    
    public int pop() {
        return main.pop();
    }
    
    public int peek() {
       return main.peek();
    }
    
    public boolean empty() {
        return main.isEmpty();
    }
}
