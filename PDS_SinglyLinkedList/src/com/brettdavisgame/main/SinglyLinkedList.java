package com.brettdavisgame.main;

/**
 * Created by Family on 2/21/2017.
 */
public class SinglyLinkedList {

    private Node first;
    private Node last;

    public SinglyLinkedList(){

    }

    public boolean isEmpty(){
        return (first == null);
        //if first points to null, then we're empty!
    }

    public void insertFirst(int data){
        //insert int data into the first link in our train!

        Node newNode = new Node(); //establish a node
        newNode.data = data; //set the data equal to the data you wish to enter
        newNode.next = first; //give the node a position location at first!
        first = newNode;
    }

    public Node deleteFirst(){
        Node temp = first;
        first = first.next; //change the first node to equal and point to the next node
        //thus removing the first node
        return temp;
    }

    public void displayList(){
        System.out.println("List (first ----> last");
        Node currentNode = first; //set the position to start displaying
        //at the first node
        while(currentNode != null){ //while current node isn't null
            currentNode.displayNode();//display the node
            currentNode = currentNode.next; //set the position
            //to the next node
        }
        System.out.println(""); //give us a clean line :)
    }

    public void insertLast(int data){
        Node current = first;
         while(current.next != null){
            current = current.next; //continue to loop
            //until current.next is null
        }
        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode; //once it's reached the last
       //replace that value with the input data
    }


}
