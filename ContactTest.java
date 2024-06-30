package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testContactClass() {
		Contact contact = new Contact("14", "Chris", "Manley", "0123456789", "11 Example RD");
		assertTrue(contact.getID().equals("14"));
		assertTrue(contact.getFirstName().equals("Chris"));
		assertTrue(contact.getLastName().equals("Manley"));
		assertTrue(contact.getPhone().equals("0123456789"));
		assertTrue(contact.getAddress().equals("11 Example RD"));
	}
	
	@Test
	void testIDNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Chris", "Manley", "0123456789", "11 Example RD");
		});
	}
	
	@Test
	void testIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("01234567890", "Chris", "Manley", "0123456789", "11 Example RD");
		});
	}
	
	@Test
	void testFirstNameNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("14", null, "Manley", "0123456789", "11 Example RD");
		});
	}
	
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("14", "Christopher", "Manley", "0123456789", "11 Example RD");
		});
	}
	
	@Test
	void testLastNameNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("14", "Chris", null, "0123456789", "11 Example RD");
		});
	}
	
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("14", "Chris", "Manley78910", "0123456789", "11 Example RD");
		});
	}
	
	@Test
	void testPhoneNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("14", "Chris", "Manley", null, "11 Example RD");
		});
	}
	
	@Test
	void testPhoneTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("14", "Chris", "Manley", "01234567890", "11 Example RD");
		});
	}
	
	@Test
	void testPhoneTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("14", "Chris", "Manley", "012345678", "11 Example RD");
		});
	}
	
	@Test
	void testAddressNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("14", "Chris", "Manley", "0123456789", null);
		});
	}
	
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("14", "Chris", "Manley", "0123456789", "11 Example RD Harrietta, Michigan");
		});
	}
}
