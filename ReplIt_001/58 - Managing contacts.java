// package com.madejski;
import java.util.Scanner;


class Contact {
    String name;
    String address;
    int age;
    String email;
    boolean isAttractive;
}

class Main {

    public static Contact newContact() {
        Scanner input = new Scanner(System.in);
        Contact c = new Contact();

        System.out.println("Give me the name:");
        c.name = input.nextLine();

        System.out.println("Give me the address:");
        c.address = input.nextLine();

        System.out.println("Give me the email:");
        c.email = input.nextLine();

        System.out.println("Is he/she attractive? (Y/N)");
        char attractive = input.nextLine().charAt(0);
        if (attractive == 'y' || attractive == 'Y') {
            c.isAttractive = true;
        }
        else {
            c.isAttractive = false;
        }

        System.out.println("Give me the age:");
        c.age = input.nextInt();


        return c;
    }

    // Printing a contact
    public static void printContact(Contact c) {
        System.out.println("Name " + c.name);
        System.out.println("Address " + c.address);
        System.out.println("email " + c.email);
        System.out.println("Attractive " + c.isAttractive);
    }

    public static boolean checkJordi(Contact c) {
        boolean found =false;
        while(found){
            if (c.name.equals("Jordi"))
                found =;
            else
                return false;
        }
        return found;
    }

    public static void main(String[] args) {

        // Let's make the things a bit more challenging
        int numberOfContacts;
        Scanner input = new Scanner(System.in);

        // How many contacts?
        System.out.println("How many contacts are you going to introduce?");
        numberOfContacts = input.nextInt();

        // Creating the array of contacts
        Contact[] contacts = new Contact[numberOfContacts];

        System.out.println("Let's introduce the contacts one by one.");
        for (int i = 0; i < numberOfContacts; i++) {
            int j=i+1;
            System.out.println("Give me the data of the contact " + j + " :");
            contacts[i] = newContact();
        }

        for (int i = 0; i < numberOfContacts; i++) {
            printContact(contacts[i]);
        }
        while(boolean search== false){
            for (int i = 0; i < numberOfContacts; i++) {
                if (checkJordi(contacts[i]) == true) {
                    boolean found = true;
                    search = !search;
                }
            }
        }
    }
