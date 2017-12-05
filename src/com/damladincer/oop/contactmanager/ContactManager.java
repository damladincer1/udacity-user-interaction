package com.damladincer.oop.contactmanager;

public class ContactManager {
	private Contact [] contacts;
	private int friendsCount;

	public ContactManager() {
		this.contacts = new Contact[100];
		this.friendsCount=0;	
	}

	public Contact[] getContacts() {
		return contacts;
	}
	public int getFriendsCount() {
		return friendsCount;
	}
	
	public void addContact(Contact contact) {
		this.contacts[friendsCount]=contact;
		this.friendsCount++;
	}
	
	public Contact searchContact(String name) {
		for(int i = 0;i<friendsCount;i++) {
			if(contacts[i].getName().equals(name)) {
				return contacts[i];
			}
		} 
		return null;
	}
	
	public void printAllContacts() {
		for(int i=0;i<friendsCount;i++) {
			System.out.println(contacts[i].getName()+"-" +contacts[i].getPhoneNumber());
		}
	}
	
}
