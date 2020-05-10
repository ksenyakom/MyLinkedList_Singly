package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(3);
        list.add(70);


        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        list.remove(0);
        System.out.println(list);

    }

}
