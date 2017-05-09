package com.brettdavisgame.main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Family on 2/12/2017.
 */
public class MobilePhone {

    ArrayList<Contacts> myContacts = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addContact(String name, String phoneNumber){
        Contacts contact = new Contacts(name, phoneNumber);
        myContacts.add(contact);
    }

    public Contacts modifyContact(String name, String phoneNumber){
        Contacts searchContact = new Contacts(name, phoneNumber);
        int position = findName(searchContact);
        if(position >= 0){
            System.out.println("What is the new name: ");
            String newName = scanner.nextLine();
            System.out.println("What is the new phone number: ");
            String newNumber = scanner.nextLine();
            searchContact.setName(newName);
            searchContact.setPhoneNumber(newNumber);
            return searchContact;
        }
        return null;
    }
    public int findName(Contacts searchContact){
        return myContacts.indexOf(searchContact);
    }

    public void removeContact(String name, String phoneNumber){
        Contacts contact = new Contacts(name, phoneNumber);
        myContacts.remove(contact);
    }

    public void queryContacts(){
        for(int i = 0; i < myContacts.size(); i++){
            System.out.println("Contact" + (i+1) + " - " + myContacts.get(i));
        }
    }


}
