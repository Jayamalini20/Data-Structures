package com.implementing.doublyLinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        head = tail = null;
        size = 0;
    }

    public void addFirst(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
        if (size == 0) {
            tail = n;
        }
        size++;
    }

    public void addLast(int data) {
        Node n = new Node(data);
        if (size == 0) {
            head = tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
        size++;
    }

    public void addAt(int index, int data) {
        if (index < 0 || index > size) {
            System.out.println("Index Out Of Bounds");
            return;
        }
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node temp = head;
            for (int jump = 1; jump < index; jump++) {
                temp = temp.next;
            }
            Node n = new Node(data);
            n.next = temp.next;
            temp.next = n;
            size++;
        }
    }

    public int getSize() {
        return size;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int getFirst() {
        if (size == 0) {
            System.out.println("Nothing To Get...");
            return -1; 
        }
        return head.data;
    }

    public int getLast() {
        if (size == 0) {
            System.out.println("Nothing To Get...");
            return -1; 
        }
        return tail.data;
    }

    public int getAt(int index) {
        if (size == 0) {
            System.out.println("Empty List");
            return -1; 
        } else if (index < 0 || index >= size) {
            System.out.println("Invalid Index");
            return -1; 
        }
        Node temp = head;
        for (int jump = 0; jump < index; jump++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("Empty List");
            return -1; 
        }
        int out = head.data;
        if (size == 1) {
            head = tail = null;
            size = 0;
        } else {
            head = head.next;
            size--;
        }
        return out;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("Empty List");
            return -1; 
        }
        int out = tail.data;
        if (size == 1) {
            head = tail = null;
            size = 0;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            size--;
        }
        return out;
    }

    public int removeAt(int index) {
        if (size == 0) {
            System.out.println("Empty List");
            return -1;
        }
        if (index < 0 || index >= size) {
            System.out.println("Index Out Of Bounds");
            return -1;
        }
        if (index == 0) {
            return removeFirst();
        } else if (index == size - 1) {
            return removeLast();
        } else {
            Node temp = head;
            for (int jump = 1; jump < index; jump++) {
                temp = temp.next;
            }
            int out = temp.next.data;
            temp.next = temp.next.next;
            size--;
            return out;
        }
    }
    
    private static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
