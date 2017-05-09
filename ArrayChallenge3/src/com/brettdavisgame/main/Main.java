package com.brettdavisgame.main;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("How big would you like your array?");
        int choiceNumber = scanner.nextInt();

        int[] myArray = getIntegers(choiceNumber);
        printIntegers(myArray);
        int[] sortedArray = sortIntegers(myArray);
        printIntegers(sortedArray);
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " values for your array.");
        int[] integers = new int[number];
        for(int i = 0; i < integers.length; i++){
            integers[i] = scanner.nextInt();
        }
        return integers;
    }

    public static void printIntegers(int[] array){
        System.out.println("Here are your integers: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(" " + array[i]);
        }
        System.out.println(" ");
    }

    public static int[] sortIntegers(int[] array){
        System.out.println("Now sorting your array.");
        int[] copyArray = new int[array.length];
        for(int i = 0; i < copyArray.length; i++){
            copyArray[i] = array[i];
        }
        boolean flag = true;
        while(flag) {
            flag = false;
            for (int i = 0; i < copyArray.length - 1; i++) {
                int temporary;
                if (copyArray[i] < copyArray[i + 1]) {
                    temporary = copyArray[i];
                    copyArray[i] = copyArray[i + 1];
                    copyArray[i + 1] = temporary;
                    flag = true;
                }
            }
        }
        return copyArray;
    }
}
