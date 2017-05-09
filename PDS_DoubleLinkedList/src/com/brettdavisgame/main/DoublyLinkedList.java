package com.brettdavisgame.main;

/**
 * Created by Family on 2/23/2017.
 */
public class DoublyLinkedList {

    private Node first;
    private Node last;

    public DoublyLinkedList(){
        this.first = null;
        this.last = null;

    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty()){
            last = newNode; //if empty, last will refer to
            //new node being created
        }else{
            first.previous = newNode;
        }

        newNode.next = first; //the new node's next field
        //will point to the old first
        this.first = newNode;
    }

    public void insertLast(int data){
        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty()){
            first = newNode;
        }else{
            last.next = newNode;//assigning the old last
            //to new node
            newNode.previous = last; //the old last
            //will be the new node's previous
        }
        last = newNode; // the linkedList's last field should
        //point to the new node
    }

    //assume a non-empty list

    public Node deleteFirst(){
        Node temp = first;
        if(first.next == null){ //if there's only one item in the list...
            last = null;
        }else{ //if there's more than one item in the list
            first.next.previous = null; //the list's first node
            //will point to null
        }
        first = first.next;//
        return temp;

        //ok this is wierd...just listen
        //we're deleting the first node in the list
        //we do this by reassigning next and previous to the
        //replacement node
    }

    public Node deleteLast(){
        Node temp = last;
        if(first.next == null){//if we only have one node...
            first = null;
        }else{
            last.previous.next = null;
            //last node's previous points to a node
            //that node's next is now pointing to null
            //thus removing the original "last node"
        }
        last = last.previous;
        return temp;
    }

    public boolean insertAfter(int key, int data){
        //key is the data that we're looking for, we search for
        //it by looking at the data value of the node

        Node current = first; //start from the beginning
        while(current.data != key){ //as long as we have not found data
            //in a particular node
            current = current.next;
            if(current == null){//if we're at the end of the list...
                return false;
            }

        }

        //remember, KEY is actually our CURRENT

        Node newNode = new Node();
        newNode.data = data;
        if(current == last){
            current.next = null; //since it's the last node, it should be pointing to null
            last = newNode;
        }else{
            newNode.next = current.next; //new node's next field should point to the node ahead of the current one
            current.next.previous = newNode;
        }

        newNode.previous = current;
        current.next = newNode;
        return true;
    }

    public Node deleteKey(int key){
        Node current = first; //start from beginning

        while(current.data != key){ //search for the key!
            current = current.next;

            if(current == null){ //if at the end...
                return null;
            }
        }

        //this means if we're here, we've found our node!

        if(current == first){
            first = current.next; //we make the first field
            //point to the node following current since current
            //is our key to be deleted
        }else{ //if not the first node...
            current.previous.next = current.next;
        }

        if(current == last){
            last = current.previous; //point to the one before it
        }else{
            current.next.previous = current.previous;
        }


        return current;
    }

    public void displayForward(){
        System.out.println("List: ");
        Node current = first;
        while(current != null){
            current.displayNode();
            current = current.next;
        }
        System.out.println("");
    }

    public void displayBackward(){
        System.out.println("List: ");
        Node current = last;
        while(current != null){
            current.displayNode();
            current = current.previous;
        }
        System.out.println("");
    }








}
