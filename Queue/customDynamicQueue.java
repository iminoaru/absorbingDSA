package com.sarthak.Queue;

import java.util.ArrayList;

public class customDynamicQueue {
        ArrayList<Integer> queue = new ArrayList<>();
        int end = -1;

        void add(int data){
            end++;
            queue.add(data);
        }

        void remove(){
            if(empty()) {
                System.out.println("Empty queue!");
                return;
            }
            end--;
            queue.remove(0);
        }

        void element(){
            if(empty()) {
                System.out.println("Empty queue!");
                return;
            }
            System.out.println(queue.get(0)); // automatically shifts indexes
        }

        void display(){
            if(empty()) {
                System.out.println("Empty queue!");
                return;
            }
            for(int i = 0 ; i <= end ; i++) System.out.print(queue.get(i) + "    ");
            System.out.println(); // for empty line after display
        }

        boolean empty(){
            if(end == -1) return true;
            return false;
        }

        void size(){
            System.out.println(end + 1);
        }

        public static void main(String[] args) {
            customDynamicQueue queue = new customDynamicQueue();

            queue.add(12);
            queue.add(14);
            queue.add(16);
            queue.add(11);
            queue.add(18);
            queue.add(16);
            queue.add(19);
            queue.add(12);
            queue.add(13);
            queue.add(11);
            queue.add(15);
            queue.add(17);
            queue.display();
            System.out.println();

            queue.element();
            System.out.println();

            queue.remove();
            queue.remove();
            queue.remove();
            queue.remove();
            queue.display();
            System.out.println();

            queue.element();
            System.out.println();

            queue.size();
        }
    }
    
