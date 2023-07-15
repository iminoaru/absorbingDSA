package com.sarthak.Queue;

import java.util.Queue;
import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String args[]) {
        // Priority Queue -  A FIFO data structure that serves elements
        //                   with the highest priorities first
        // 				          before elements with lower priority

        // Strings in default order
        Queue<String> queue = new PriorityQueue<>();

        // Strings in reverse order
        // Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer("Platz");
        queue.offer("Ronnie");
        queue.offer("Kevin");
        queue.offer("Arnold");
        queue.offer("Cuttler");

        // Printing
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
      
    }
}


