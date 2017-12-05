package com.damladincer.oop.contactmanager;

public class Main {

	public static void main(String[] args) {
		ContactManager manager = new ContactManager();

		Contact contact1 = new Contact();
		contact1.setName("Yasemin");
		contact1.setPhoneNumber("05354635432");

		manager.addContact(contact1);

		Contact contact2 = new Contact();
		contact2.setName("Berfu");
		contact2.setPhoneNumber("05354636532");
		manager.addContact(contact2);

		Contact contact3 = new Contact();
		contact3.setName("Mine");
		contact3.setPhoneNumber("05454635432");
		manager.addContact(contact3);

		Contact contact4 = new Contact();
		contact4.setName("Ekin");
		contact4.setPhoneNumber("05457135432");
		manager.addContact(contact4);

		Contact contact5 = new Contact();
		contact5.setName("Emre");
		contact5.setPhoneNumber("05454635400");
		manager.addContact(contact5);

		Contact contact = manager.searchContact("Yasemin");
		System.out.println(contact.getPhoneNumber());
	}
}