package com.company.Khamis;
//Yunis , 2/25/20,  CSCI 1660
/*Write a program that includes a class representing contact information for a person including their name and email address.
 This class should include a method for displaying the contact's name and email address.
 The program should also include a class for business contacts that extends the contact class and stores
 the contact's phone number.The business contact class should override the base class's method that displays the name
 and email address so that it displays the phone number in addition to the name and email address.
 Create instances of both classes to demonstrate functionality.
 */

public class Main {

    public static void main(String[] args) {



        Person p1 = new Person("Yunis","112609@swcsd.us");
        p1.display();
        Person p2 = new Person("bob","11209@swcsd.us");
        p2.display();

        BusinessContacts bc1 = new BusinessContacts("yunos", "ysoserious@gmail.com", "123-456-7890");
        bc1.display();
        BusinessContacts bc2 = new BusinessContacts("bunos", "bsoserioud@gmail.com", "098-765-4321");
        bc2.display();





    }
}
