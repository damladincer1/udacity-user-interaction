package com.damladincer.oop.contactmanager;

import java.util.Scanner;

public class ContactManager {
	// Fields
	public final int SIZE = 100;
	
	private Contact[] contacts;
	private int friendsCount;

	private Scanner scanner;

	// Constructor
	public ContactManager() {
		this.contacts = new Contact[SIZE];
		this.friendsCount = 0;
		this.scanner = new Scanner(System.in);
	}

	// Methods

	public void addContact() {
		Contact contact = new Contact();
		System.out.println("Enter name of contact:");
		String name = scanner.nextLine();
		contact.setName(name);

		System.out.println("Please enter the number of contact:");
		String phone = scanner.nextLine();
		contact.setPhoneNumber(phone);

		System.out.println("Please enter the e-mail of contact:");
		String email = scanner.nextLine();
		contact.setEmail(email);

		this.contacts[friendsCount] = contact;
		this.friendsCount++;

		System.out.println(friendsCount + " contact added to list");

		printMenu();
	}

	public void searchContact(String name) {
		for (int i = 0; i < friendsCount; i++) {
			if (contacts[i].getName().toUpperCase().contains(name.toUpperCase())) {
				System.out.println(contacts[i].getName() + "-" + contacts[i].getPhoneNumber());
			}
		}
		printMenu();
	}

	public void deleteContact(String name) {
		Contact[] newContactList = new Contact[SIZE];
		int j = 0;
		for (int i = 0; i < this.friendsCount; i++) {
			if (this.contacts[i].getName().toUpperCase().equals(name.toUpperCase())) {
				this.contacts[i] = null;
				System.out.println("The contact deleted");
				this.friendsCount--;
			} else {
				newContactList[j] = this.contacts[i];
				j++;
			}
		}
		
		
		
		this.contacts = newContactList;
		printMenu();
	}

	public void listContacts() {
		if (friendsCount != 0) {
			for (int i = 0; i < friendsCount; i++) {
				System.out.println(
						contacts[i].getName() + "-" + contacts[i].getPhoneNumber() + "-" + contacts[i].getEmail());
			}
			printMenu();
		} else {
			System.out.println("There is no contact in your list. ");
			System.out.println("Please add a contact");
			printMenu();
		}
	}

	public void printMenu() {
		System.out.println("");
		System.out.println("1 - Add New Contact\r\n" + "2 - Search Contact\r\n" + "3 - Delete Contact\r\n"
				+ "4 - List All Contacts\r\n" + "5 - Exit the Program\r\n" + "");
		System.out.println("Please choose the operation you want");
		scanMenuItem();
	}

	public void scanMenuItem() {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		switch (i) {
		case 1:
			addContact();
			break;
		case 2:
			System.out.println("Please enter the contact name you want to search:");
			String name = scanner.nextLine();
			searchContact(name);
			break;
		case 3:
			System.out.println("Please enter the contact name:");
			String name1 = scanner.nextLine();
			deleteContact(name1);
			break;
		case 4:
			listContacts();
			break;
		case 5:
			scanner.close();
			System.exit(0);
			break;
		default:
			System.out.println("Choose the correct operation");
			break;
		}
		scan.close();
	}

	// Getter & Setter
	public Contact[] getContacts() {
		return contacts;
	}

	public int getFriendsCount() {
		return friendsCount;
	}
}