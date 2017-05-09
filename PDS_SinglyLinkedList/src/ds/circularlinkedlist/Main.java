package ds.circularlinkedlist;

import com.brettdavisgame.main.SinglyLinkedList;

/**
 * Created by Family on 2/22/2017.
 */
public class Main {

    public static void main(String[] args){
        CircularLinkedList myList = new CircularLinkedList();
        myList.insertFirst(100);
        myList.insertFirst(50);
        myList.insertFirst(99);
        myList.insertFirst(88);
        myList.insertLast(99999999);
        myList.displayList();
    }
}
