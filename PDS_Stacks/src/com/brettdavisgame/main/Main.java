package com.brettdavisgame.main;

import ds.stack.Stack;

public class Main {

    public static void main(String[] args) {

        System.out.println(reverseString("Hello"));

//        Stack theStack = new Stack(3);
//        theStack.push(20);
//        theStack.push(40);
//        theStack.push(60);
//        theStack.push(80);
//
//        while(!theStack.isEmpty()){
//            long value = theStack.pop();
//            System.out.println(value);
//        }
//        System.out.println("Here's our reverse string test.");
//        String test = "I love chicken.";
//        reverseString(test);
//
//        //HERE'S THE BETTER SOLUTION!


    }

    public static String reverseString(String str){
        int stackSize = str.length(); //gets the max stack size

        Stack theStack = new Stack(stackSize); //now our stack is the same
        //size as teh number of elements in the string

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i); //getting the char from the input string
            theStack.push(ch);
        }

        String result = "";
        while(!theStack.isEmpty()){
            char ch = theStack.pop();
            result = result + ch; //appending the output
        }

        return result;
    }
}
