package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class AddressBookSystem {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to address book");
        Contact contact = addContact();
        System.out.println(contact);
    }

    private static Contact addContact() {
        Contact contact = new Contact();
        System.out.println("Enter First name:");
        contact.setFirstName(scanner.next());
        System.out.println("Enter Last name:");
        contact.setLastName(scanner.next());
        System.out.println("Enter Address:");
        contact.setAddress(scanner.next());
        System.out.println("Enter City :");
        contact.setCity(scanner.next());
        System.out.println("Enter State :");
        contact.setState(scanner.next());
        System.out.println("Enter Zip Code :");
        contact.setZip(scanner.next());
        System.out.println("Enter Phone Number :");
        contact.setPhoneNumber(scanner.next());
        System.out.println("Enter Email :");
        contact.setEmail(scanner.next());
        return contact;
    }
}