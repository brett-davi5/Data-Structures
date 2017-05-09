package ds.stack;

/**
 * Created by Family on 2/19/2017.
 */
//public class StackChar {
//    private int maxSize; //stores size of stack
//    private char[] stackArray; //our containter that stores our list of items
//    private int top; //represents the index position of the last item that was
//    //placed on top of the stack
//
//    public StackChar(int size){
//        this.maxSize = size;
//        this.stackArray = new char[maxSize];
//        this.top = -1; //this means the first item that gets placed there is "0"
//    }
//
//    public void push(char j){
//        if(isFull())
//            System.out.println("This stack is already full.");
//        else {
//            top++;
//            stackArray[top] = j;
//        }
//    }
//
//    public char pop() {
//        if (isEmpty()){
//            System.out.println("This stack is empty.");
//            return 'a';
//        }
//        else {
//            int old_top = top;
//            top--;
//            return stackArray[old_top];
//        }
//    }
//
//    public char peak(){
//        return stackArray[top];
//    }
//
//    public boolean isEmpty(){
//        return (top == -1);
//    }
//
//    public boolean isFull(){
//        return (maxSize - 1 == top);
//    }
//
//    public static Stack reverseString(String str){
//        Stack charStack = new Stack(str.length());
//        char alpha;
//
//        for(int i = 0; i < str.length(); i++){
//            alpha = str.charAt(i);
//            charStack.push(alpha);
//        }
//        return charStack;
//    }
//
//
//}
