package com.brettdavisgame.main;

public class Main {

    public static void main(String[] args) {

        SinglyLinkedList myList = new SinglyLinkedList();
        myList.insertFirst(100);
        myList.insertFirst(50);
        myList.insertFirst(99);
        myList.insertFirst(88);
        myList.insertLast(99999999);
        myList.displayList();

    }
}
