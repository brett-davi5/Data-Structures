package com.brettdavisgame.main;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone myPhone = new MobilePhone();

    public static void main(String[] args) {

        boolean flag = false;
        int choice = 0;



        while(!flag){
            System.out.println("Enter your choice: (0-4)");
            choice = scanner.nextInt();
            switch(choice){

                case 0:
                    printContacts();
                    break;
                case 1:
                    addContact();
                    break;
                case 2:
                    modifyContact();
                    break;
                case 3:
                    removeContacts();
                    break;
                case 4:
                    flag = true;
                    break;
            }
        }

    }

    public static void printContacts(){
        myPhone.queryContacts();
    }
    public static void addContact(){
        System.out.println("Enter the name of the contact: ");
        String newName = scanner.nextLine();
        System.out.println("Enter the name of the phone number: ");
        String newNumber = scanner.nextLine();
        myPhone.addContact(newName, newNumber);
    }
    public static void modifyContact(){
        System.out.println("Enter the name of the contact you wish to modify: ");
        String modifyName = scanner.nextLine();
        System.out.println("Enter the number you wish to modify: ");
        String modifyNumber = scanner.nextLine();
        myPhone.modifyContact(modifyName, modifyNumber);
    }
    public static void removeContacts(){
        System.out.println("Enter the name of the contact you wish to remove:" );
        String removeName = scanner.nextLine();
        System.out.println("Enter the number of hte contact you wish to remove: ");
        String removeNumber = scanner.nextLine();
        myPhone.removeContact(removeName, removeNumber);
    }

}
