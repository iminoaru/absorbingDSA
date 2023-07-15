//                    Throws exception   |   Returns special value
//        Insert   ->	   add(e)	         |        offer(e)
//        Remove   ->    remove()	       |        poll()
//        Examine  ->    element()	     |        peek()

package com.sarthak.Queue;

public class customQueue {
    int[] queue;
    final static int defaultSize = 9;
    int end = -1; // inserts from end, extracts from start FIFO
    customQueue(){
        this(defaultSize);
    }
    customQueue(int size){
        this.queue = new int[size];
    }

    void add(int data){
        if(full()) {
            System.out.println("Queue Overflow!");
            return;
        }
        end++;
        queue[end] = data;
    }

    void remove(){
        if(empty()){
            System.out.println("Empty Queue");
            return;
        }
        for(int i = 1 ; i < end ; i++){
            queue[i-1] = queue[i]; // shifting the remaining elements forward because the first element is removed.
        }
        end--;
    }

    void element(){
        if(empty()){
            System.out.println("Empty Queue");
            return;
        }
        System.out.println(queue[0]);
    }

    void display(){
        if(empty()) {
            System.out.println("Empty Stack!");
            return;
        }
        for(int i = 0 ; i <= end ; i++) System.out.print(queue[i] + "    ");
        System.out.println(); // for empty line after display
    }

    boolean full(){
        if(end == queue.length - 1) return true;
        return false;
    }

    boolean empty(){
        if(end == -1) return true;
        return false;
    }

    public static void main(String[] args) {
        customQueue queue = new customQueue();

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
