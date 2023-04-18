package week3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactTest {
//	@Test
//    void testContact() {
//          Contact contact=new Contact("BL43452", "Ryan", "Reynolds", "5555555555", "1235 Laguna Drive Huron Ohio");
//          assertTrue(contact.getContactID().equals("BL43452"));
//          assertTrue(contact.getFirstName().equals("Ryan"));
//          assertTrue(contact.getLastName().equals("Reynolds"));
//          assertTrue(contact.getPhoneNumber().equals("5555555555"));
//          assertTrue(contact.getContactAddress().equals("1235 Laguna Drive Huron Ohio"));
//
//}

    @Test
    void testContactIDToLong() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("BL43452111111111", "Ryan", "Reynolds", "5555555555",
                    "1235 Laguna Drive Huron Ohio");
        });
    }

    @Test
    void testContactFirstNameToLong() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("BL43452", "Ryan1234567891012", "Reynolds", "5555555555",
                    "1235 Laguna Drive Huron Ohio");
        });
    }

    @Test
    void testContactLastNameToLong() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("BL43452", "Ryan", "Reynolds12345678910", "5555555555",
                    "1235 Laguna Drive Huron Ohio");
        });
    }

    @Test
    void testContactStreetAddressToLong() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("BL43452", "Ryan", "Reynolds", "555-555-5555",
                    "1235 Laguna Drive Huron Ohio making this longer for fun");
        });
    }

    @Test
    void testContactPhoneNumberToLong() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("BL43452", "Ryan", "Reynolds", "555-555-555555555",
                    "1235 Laguna Drive Huron Ohio");
        });
    }

    @Test
    void testContactPhoneNumberToShort() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("BL43452", "Ryan", "Reynolds", "555",
                    "1235 Laguna Drive Huron Ohio");
        });
    }
}