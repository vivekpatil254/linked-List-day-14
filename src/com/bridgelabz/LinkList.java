package com.bridgelabz;

public class LinkList {
    Node head;

    public static void main(String[] args) {
        LinkList linkList = new LinkList();

        linkList.add(70);
        linkList.add(30);
        linkList.add(56);
        linkList.print();
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
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
