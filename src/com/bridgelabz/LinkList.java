package com.bridgelabz;

public class LinkList {
    Node head;

    public static void main(String[] args) {
        LinkList linkList = new LinkList();


        linkList.add(70);
        linkList.add(30);
        linkList.add(56);
        linkList.popLast();
        //linkList.addBetween(70);
        //linkList.pop();
        linkList.print();
    }

    public void popLast() {
        if (head == null)
            System.out.println("the linklist is empty");
        else {
            Node deleteElement = head;

            Node temp=deleteElement;
            while (deleteElement.next != null) {
                temp =deleteElement;
                deleteElement=deleteElement.next;
            }
            temp.next=null;
            deleteElement.data=0;
            deleteElement.next=null;
            System.out.println("last element popped out sucessfully ...");


        }


    }


    public void pop() {
        Node deleteElement = head;
        head = head.next;
        deleteElement.data = 0;
        deleteElement.next = null;
    }

    public void addBetween(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                if (temp.data == 56) {
                    newNode.next = temp.next;
                    temp.next = newNode;
                    break;
                }
                temp = temp.next;
            }

        }


    }

    public void addAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + "  ===>>  ");
            temp = temp.next;
        }
    }

}
