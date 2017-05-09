package ds.queue;

/**
 * Created by Family on 2/19/2017.
 */
public class Queue {

    private int maxSize; //initialize the containter with a set number of slots
    private long[] queArray; //slots to main the data
    private int front; //this will be the index position for the element in the front
    private int rear; //going to be index position for the element at the back of the line
    private int nItems; //counter to maintain the number of items in our queue

    public Queue(int size){
        this.maxSize = size;
        this.queArray = new long[size];
        front = 0; //index position of the first slot of the array
        rear = -1; //there is no item in the array yet to be considered as the last item
        nItems = 0;//we don't have elements in the array yet
    }

    public void insert(long j){
        if(isFull()){
            System.out.println("Your queue is full!");
        }else {
            rear++;
            queArray[rear] = j; //puts the new element into the array
            nItems++; //our number of items has gone up :)
        }
    }

    public long remove(){ //stuff gets removed from the front!
        long temp = queArray[front];
        if(isEmpty()){
            System.out.println("Your queue is empty!");
            return 0;
        }else{
            front++;
            if(front == maxSize){
                front = 0; //we can set front back to the zero'th index so that
                //we can utilize the entire array again
            }
            nItems--;
            return temp;
        }

    }

    public long peekFront(){ //what's at the front of the line?
        //we're not changing anything
        return queArray[front];
    }

    public boolean isEmpty(){
        return (nItems == 0 );
    }

    public boolean isFull(){
        return (nItems == maxSize);
    }

    public void view(){
        System.out.print("[ " );
        for(int i = 0; i < queArray.length; i++){
            System.out.print(queArray[i] + " " );

        }
        System.out.print("]");
    }




}
