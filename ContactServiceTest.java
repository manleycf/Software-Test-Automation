package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class ContactServiceTest {
	private ContactService contactService;

	@BeforeEach
	void setUp() {
		contactService = new ContactService();
		contactService.addContact("14", "Chris", "Manley", "0123456789", "11 Example RD");
		contactService.addContact("11", "John", "Smith", "0123456789", "12 Example RD");
	}
	
	@Test
	void testAddContact() {
		assertTrue(contactService.getSize()==2);
	}
	
	@Test
	void testDeleteContact() {
		contactService.deleteContact("14");
		assertTrue(contactService.getSize()==1);
	}
	
	@Test
	void testUpdateFirstName() {
		contactService.updateFirstName("14", "Drew");
		assertTrue(contactService.findFirstName("14").equals("Drew"));
	}
	
	@Test
	void testUpdateLastName() {
		contactService.updateLastName("14", "Spencer");
		assertTrue(contactService.findLastName("14").equals("Spencer"));
	}
	
	@Test
	void testUpdatePhone() {
		contactService.updatePhone("14", "9876543210");
		assertTrue(contactService.findPhone("14").equals("9876543210"));
	}
	
	@Test
	void testUpdateAddress() {
		contactService.updateAddress("14", "Test Address");
		assertTrue(contactService.findAddress("14").equals("Test Address"));
	}
}