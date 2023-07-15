package com.sarthak.Stack;

import java.util.ArrayList;

public class customDynamicStack {
    ArrayList<Integer> stack = new ArrayList<>();
    int index = -1;

    void push(int data){
        index++;
        stack.add(data);
    }

    void pop(){
        if(empty()) {
            System.out.println("Empty Stack!");
            return;
        }
        index--;
        stack.remove(stack.size() - 1);
    }

    void peek(){
        if(empty()) {
            System.out.println("Empty Stack!");
            return;
        }
        System.out.println(stack.get(stack.size() - 1));
    }

    void display(){
        if(empty()) {
            System.out.println("Empty Stack!");
            return;
        }
        for(int i = index ; i >= 0 ; i--) System.out.println(stack.get(i)); // LIFO
    }

    boolean empty(){
        if(index == -1) return true;
        return false;
    }

    void size(){
        System.out.println(index + 1);
    }

    public static void main(String[] args) {
        customDynamicStack stack = new customDynamicStack();

        stack.push(12);
        stack.push(14);
        stack.push(16);
        stack.push(11);
        stack.push(18);
        stack.push(16);
        stack.push(19);
        stack.push(12);
        stack.push(13);
        stack.push(11);
        stack.push(15);
        stack.push(17);
        stack.display();
        System.out.println();

        stack.peek();
        System.out.println();

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.display();
        System.out.println();

        stack.peek();
        System.out.println();

        stack.size();
    }
}
