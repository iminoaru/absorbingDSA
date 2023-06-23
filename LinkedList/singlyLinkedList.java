package com.sarthak.LinkedList;

public class singlyLinkedList {

    Node head;
    Node tail;
    static int size;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
        Node(int data , Node next) {
            this.data = data;
            this.next = next;
        }

    }
//*******************************************************************************************

    void insertFirst(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;

        if(tail == null) tail = head;
        size++;
    }

//*******************************************************************************************

    void insertLast(int data){
        if(tail == null) {
            insertFirst(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
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

    void deleteFirst(){
        if (head == null) tail = null;
        head = head.next;

        size--;
    }

//*******************************************************************************************

    void deleteLast(){
        Node last2nd = getNodePointer(size - 2);
        tail = last2nd;
        tail.next = null;

        size--;
    }

//*******************************************************************************************

    void deleteAt(int index){
        if(index == 0) deleteFirst();

        Node n1 = getNodePointer(index-1);
        Node n2 = getNodePointer(index+1);
        n1.next = n2;

        size--;
    }

//*******************************************************************************************

    void display(){
        Node cur = head; //current(cur) is an iterator used to traverse through the linked-list

        while(cur != null){
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

//*******************************************************************************************

    void search(int data){
        Node cur = head;
        int count = 0;
        
        while(cur != null){
            if(cur.data == data){
                System.out.println("Found at index number " + count);
                return;
            }
            cur = cur.next;
            count++;
        }
        System.out.println("Not Found");
    }

//*******************************************************************************************

    public static void main(String[] args) {
        singlyLinkedList list = new singlyLinkedList();

        list.insertFirst(21);
        list.insertFirst(26);
        list.insertFirst(11);
        list.insertFirst(32);
        list.insertFirst(94);
        list.insertFirst(54);
        list.insertFirst(68);
        list.insertLast(19);
        list.display();

        list.deleteFirst();
        list.display();

        list.deleteLast();
        list.display();

        list.insertAt(3, 100);
        list.display();

        list.deleteAt(5);
        list.display();

        list.search(21);
        list.search(88);
    }
}