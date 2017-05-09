package com.brettdavisgame.main;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(22);
        list.insertFirst(33);
        list.insertFirst(44);
        list.insertFirst(55);
        list.insertLast(66);
        list.insertLast(77);
        list.insertFirst(88);
        list.displayForward();
        list.displayBackward();
        list.deleteFirst();
        list.deleteLast();
        list.displayForward();
        list.displayBackward();
        list.deleteKey(22);

    }
}
