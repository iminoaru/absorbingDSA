package com.sarthak.Stack;

public class customStack {
    int[] stack;
    final static int defaultSize = 9;
    int index = -1;

    customStack(){
        this(defaultSize); // if no size is passed then the size of 'stack' = defaultSize.
    }
    customStack(int size){
        this.stack = new int[size]; // created the array 'stack' with size = size.
    }

    void push(int data){
        if(full()) {
            System.out.println("Stack Overflow!");
            return;
        }
        index++;
        stack[index] = data;
    }

    void pop(){
        if(empty()) {
            System.out.println("Empty Stack!");
            return;
        }
        index--;
    }

    void peek(){
        if(empty()) {
            System.out.println("Empty Stack!");
            return;
        }
        System.out.println(stack[index]);
    }

    void display(){
        if(empty()) {
            System.out.println("Empty Stack!");
            return;
        }
        for(int i = index ; i >= 0 ; i--) System.out.println(stack[i]); // LIFO
    }

    boolean full(){
        if(index == stack.length - 1) return true;
        return false;
    }

    boolean empty(){
        if(index == -1) return true;
        return false;
    }

    public static void main(String[] args) {
        customStack stack = new customStack();

        stack.push(12);
        stack.push(14);
        stack.push(16);
        stack.push(11);
        stack.push(18);
        stack.push(16);
        stack.push(19);
        stack.display();
        System.out.println();

        stack.peek();
        System.out.println();

        stack.pop();
        stack.pop();
        stack.display();
        System.out.println();

        stack.peek();
        System.out.println();
    }
}

