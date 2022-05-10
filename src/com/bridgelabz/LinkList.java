package com.bridgelabz;

public class LinkList {
    Node head;

    public static void main(String[] args) {
        LinkList linkList = new LinkList();

        linkList.addAtEnd(56);
        linkList.addAtEnd(70);
        linkList.addBetween(30);
        linkList.print();
    }
    public void addBetween(int data)
    {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp=head;
            while(temp.next!=null)
            {
                if(temp.data==56)
                {
                    newNode.next=temp.next;
                    temp.next=newNode;
                    break;
                }
                temp=temp.next;
            }

        }



    }
    public void addAtEnd(int data)
    {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.next=null;
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
            System.out.println(temp.data+"  ===>>  ");
            temp = temp.next;
        }
    }

}
