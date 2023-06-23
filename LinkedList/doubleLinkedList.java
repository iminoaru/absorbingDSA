package com.sarthak.LinkedList;

public class doubleLinkedList {

    Node head;
    Node tail;
    int size;

    class Node{
        int data;
        Node next;
        Node back;

        Node(int data){
            this.data = data;
        }
        Node(int data , Node next) {
            this.data = data;
            this.next = next;
        }
        Node(int data , Node next, Node back) {
            this.data = data;
            this.next = next;
            this.back = back;
        }

    }


//*******************************************************************************************

    void insertFirst(int data){
        Node node = new Node(data);
        node.next = head;
        node.back = null;
        if(head != null) head.back = node; // or else it will give nullPointerException
        head = node;

        size++;
    }

//*******************************************************************************************

    void insertLast(int data){
        Node node = new Node(data);
        Node last = getNodePointer(size-1);

        last.next = node;
        node.back = last;
        node.next = null;
        tail = node;

        size++;
    }

//*******************************************************************************************

    void insertAt(int index, int data){
        Node node = new Node(data);
        Node n1 = getNodePointer(index-1);
        Node n2 = getNodePointer(index);

        n1.next = node;
        node.back = n1;
        node.next = n2;
        n2.back = node;

        size++;
    }

//*******************************************************************************************

    Node getNodePointer(int index){ //to get the address of any specific node
        Node ptr = head;
        for(int i = 0 ; i < index ; i++) ptr = ptr.next;
        return ptr;
    }

//*******************************************************************************************

    void display(){
       Node cur = head; //current(cur) is an iterator used to traverse through the linked-list

        while(cur != null){
            System.out.print(cur.data + " ");
            cur = cur.next; // iterating (I usually forget it)
        }
        System.out.println();
    }

//*******************************************************************************************

    void deleteFirst() {
        head = head.next;
        if (head == null) tail = null;
        size--;
    }

//*******************************************************************************************

    void deleteLast(){
        Node last2nd = getNodePointer(size - 2);
        tail.next = null;
        tail = last2nd;

        size--;
    }

//*******************************************************************************************

    void deleteAt(int index){
        Node n1 = getNodePointer(index-1);
        Node n2 = getNodePointer(index+1);
        n1.next = n2;
        n2.back = n1;

        size--;
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
        doubleLinkedList list = new doubleLinkedList();

        list.insertFirst(21);
        list.insertFirst(26);
        list.insertFirst(11);
        list.insertFirst(32);
        list.insertFirst(94);
        list.insertFirst(54);
        list.insertLast(10);
        list.display();

        list.insertAt(2 , 100);
        list.display();

        list.deleteFirst();
        list.display();

        list.deleteAt(3);
        list.display();

        list.search(32);
        list.search(69);
    }
}
