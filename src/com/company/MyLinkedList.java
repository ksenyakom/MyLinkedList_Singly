package com.company;


import java.util.Arrays;

public class MyLinkedList {
    public Node head;
    public int size = 0;

    public int get(int index){
        Node temp = head;
        int i =0;
        while (temp!= null){
            if (i == index) return temp.getI();
            temp = temp.getNext();
            i++;
        }
        throw new IllegalArgumentException();
    }

    public void remove(int index) {
        if (index >= size) {
            throw new IllegalArgumentException();

        }
        Node temp = head;
        if (index == 0) {
            head = head.getNext();
            size--;
            return;
        }
        int i = 0;
        while (i != (index - 1)) {
            temp = temp.getNext();
            i++;
        }
        temp.setNext(temp.getNext().getNext());
        size--;
    }


    public void add(int value) {
        if (size == 0) {
            head = new Node(value);
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node(value));
        }
        size++;
    }

    public String toString() {
        int[] array = new int[size];
        Node temp = head;

        for (int i = 0; i < size; i++) {
            array[i] = temp.getI();
            temp = temp.getNext();
        }
        return Arrays.toString(array);
    }

    private class Node {
        int i;
        Node next;

        public Node(int value) {
            i = value;
        }

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
