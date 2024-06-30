package contact;
import java.util.ArrayList;
import java.util.List;

public class ContactService {
	private List<Contact> contacts;
	
	public ContactService() {
		this.contacts = new ArrayList<>();
	}
	
	public void addContact(String contactID, String firstName, String lastName, String phone, String address) {
		Contact newContact = new Contact(contactID, firstName, lastName, phone, address);
		contacts.add(newContact);
	}
	
	public void deleteContact(String contactID) {
		for (Contact contact : contacts) {
			if (contact.getID() == contactID) {
				contacts.remove(contact);
			}
		}
	}
	
	public void updateFirstName(String contactID, String firstName) {
		for (Contact contact : contacts) {
			if (contact.getID() == contactID) {
				contact.setFirstName(firstName);
			}
		}
	}
	
	public void updateLastName(String contactID, String lastName) {
		for (Contact contact : contacts) {
			if (contact.getID() == contactID) {
				contact.setLastName(lastName);
			}
		}
	}
	public void updatePhone(String contactID, String phone) {
		for (Contact contact : contacts) {
			if (contact.getID() == contactID) {
				contact.setPhone(phone);
			}
		}
	}
	public void updateAddress(String contactID, String address) {
		for (Contact contact : contacts) {
			if (contact.getID() == contactID) {
				contact.setAddress(address);
			}
		}
	}
	public int getSize() {
		int size = contacts.size();
		return size;
	}
	
	public String findFirstName(String contactID) {
		for (Contact contact : contacts) {
			if (contact.getID().equals(contactID)) {
				String name = contact.getFirstName();
				return name;
			}
		}
		return null;
	}
	public String findLastName(String contactID) {
		for (Contact contact : contacts) {
			if (contact.getID().equals(contactID)) {
				String name = contact.getLastName();
				return name;
			}
		}
		return null;
	}
	public String findPhone(String contactID) {
		for (Contact contact : contacts) {
			if (contact.getID().equals(contactID)) {
				String phone = contact.getPhone();
				return phone;
			}
		}
		return null;
	}
	public String findAddress(String contactID) {
		for (Contact contact : contacts) {
			if (contact.getID().equals(contactID)) {
				String address = contact.getAddress();
				return address;
			}
		}
		return null;
	}
}
