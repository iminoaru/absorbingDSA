package com.sarthak.LinkedList;

public class circularLinkedList {

    Node head;
    Node tail;
    static int size;

    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

//*******************************************************************************************

    void insertFirst(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        head = node;

        size++;
    }

//*******************************************************************************************

    void insertLast(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;

        size++;
    }

//*******************************************************************************************

    void insertAt(int index , int data){
        Node node = new Node(data);

        Node n1 = getNodePointer(index-1);
        Node n2 = getNodePointer(index);

        n1.next = node;
        node.next = n2;

        size++;
    }

//*******************************************************************************************

    Node getNodePointer(int index){
        Node ptr = head;
        for(int i = 0 ; i < index ; i++) ptr = ptr.next;
        return ptr;
    }

//*******************************************************************************************

    void deleteFirst() {
        if(head == null) return;

        head = head.next;
        tail.next = head;
// a doubt is what will be the tail here
        size--;
    }

//*******************************************************************************************

    void deleteLast(){
        if(head == null) return;

        Node elementBeforeTail = getNodePointer(size-1); // idk why -1 instead of -2
        elementBeforeTail.next = head;
        tail = elementBeforeTail;

        size--;
    }

//*******************************************************************************************

    void deleteAt(int index){
        if(index == size-1){ // this edge case is only given in circularLL because tail -> head
            deleteLast();    // and if it was removed like other LLs then the circular
            return;          // architecture would have been broken.
        }
        if(index == 0) deleteFirst();

        Node n1 = getNodePointer(index - 1);
        Node n2 = getNodePointer(index + 1);

        n1.next = n2;

        size--;
    }

//*******************************************************************************************

    void display(){
        Node cur = head; //current(cur) is an iterator used to traverse through the linked-list
        if(head == null){
            System.out.println("Empty LinkedList");

        }
        do{
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        while(cur != head);
        System.out.println();
    }

//*******************************************************************************************

    void search(int data){
        Node cur = head;
        int count = 0;

        do {
            if(cur.data == data){
                System.out.println("Found at index number " + count);
                return;
            }
            cur = cur.next;
            count++;
        }
        while(cur != head);

        System.out.println("Not Found");
    }

//*******************************************************************************************

    public static void main(String[] args) {
        circularLinkedList list = new circularLinkedList();

        list.insertFirst(43);
        list.insertFirst(64);
        list.insertFirst(49);
        list.insertFirst(12);
        list.insertFirst(95);
        list.display();

        list.insertLast(100);
        list.display();

        list.insertAt(2, 5);
        list.display();

        list.deleteFirst();
        list.display();

        list.deleteLast();
        list.display();

        list.deleteAt(3);
        list.display();

        list.search(5);
        list.search(11);

    }
}
