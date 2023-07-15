// this code is not properly written rn.

package com.sarthak.Queue;

public class circularQueue {
    int[] queue;
    final static int defaultSize = 9;
    int end = 0 , front = 0;
    int size = 0;
    circularQueue(){
        this(defaultSize);
    }
    circularQueue(int size){
        this.queue = new int[size];
    }

    void add(int data){
        if (full()) {
            System.out.println("Queue Overflow!");
            return;
            }
        end++;
        queue[end] = data;
        end = end % queue.length; // main logic of circular queue.
        size++;
    }

    void remove(){
        if(empty()) {
            System.out.println("Empty Stack!");
            return;
        }
        front = front % queue.length;
        size--;
    }

    void element(){// returns front
        if(empty()) {
            System.out.println("Empty Stack!");
            return;
        }
        System.out.println(queue[front]);
    }

    void display(){
        if(empty()) {
            System.out.println("Empty Stack!");
            return;
        }
        int i = front;
        do {
            System.out.print(queue[i] + "   ");
            i++;
            i = i % queue.length;
        }
        while (i != end);
        System.out.println(); // for empty line after display
    }

    boolean full(){
        if(size == queue.length) return true;
        return false;
    }

    boolean empty(){
        if(size == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        circularQueue queue = new circularQueue();

        queue.add(22);
        queue.add(24);
        queue.add(25);
        queue.add(21);
        queue.add(28);
        queue.add(26);
        queue.add(29);

        queue.display();
        System.out.println();

        queue.element();
        System.out.println();

        queue.remove();
        queue.remove();
        queue.display();
        System.out.println();

        queue.element();
        System.out.println();
    }
}
